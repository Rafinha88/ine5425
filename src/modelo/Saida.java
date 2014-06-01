package modelo;

import modelo.CelulaSingletonBuilder;
import modelo.Chamada;
import modelo.Estatistica;
import modelo.Evento;

public class Saida extends Evento {

	public Saida(Chamada chamada, long tempo) {
		super(chamada, tempo);
	}

	@Override
	public Evento executar() {
		getChamada().finalizar();
		coletarEstatisticas();
		return null;
	}

	public void coletarEstatisticas() {
		Estatistica estatistica = Estatistica.getInstance();
		estatistica.decrementarNumeroDeChamadasNoSistema();
		estatistica.analisarTempoDaChamada(getChamada().getDuracao());
                estatistica.atualizarMaiorNumeroDeChamadasNoSitema();
		switch (getChamada().getEstado()) {
		case SEM_CANAL:
			if (getChamada().getCelulaDestino() == CelulaSingletonBuilder
					.getInstance().constroiOuGetC1()) {
				estatistica.incrementarChamadaPerdidaFaltaDeCanalC1();
			} else if (getChamada().getCelulaDestino() == CelulaSingletonBuilder
					.getInstance().constroiOuGetC2()) {
				estatistica.incrementarChamadaPerdidaFaltaDeCanalC2();
			}
			break;
		case SEM_SINAL:
			estatistica.incrementarChamadasSemSinal();
			break;
		case SUCESSO:
			estatistica.incrementarChamadasCompletadas();
			break;
		}
	}

}
