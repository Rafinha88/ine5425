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

	// TODO: Implementar
	public void coletarEstatisticas() {
		Estatistica estatistica = Estatistica.getInstance();
		estatistica.decrementarNumeroDeChamadasNoSistema();
		estatistica.analisarTempoDaChamada(getChamada().getDuracao());
		switch (getChamada().getEstado()) {
		case SEM_CANAL:
			if (getChamada().getCelulaDestino() == CelulaSingletonBuilder
					.getInstance().constroiOuGetC1()) {
				estatistica.incrementarChamadaPerdidaFaltaDeCanalC1();
				System.out.printf("Saida | SEM CANAL C1\n");
			} else {
				estatistica.incrementarChamadaPerdidaFaltaDeCanalC2();
				System.out.printf("Saida | SEM CANAL C2\n");
			}
			break;
		case SEM_SINAL:
			System.out.printf("Saida | SEM SINAL chamado\n");
			estatistica.incrementarChamadasSemSinal();
			break;
		case SUCESSO:
			System.out.printf("Saida | SUCESSO chamado\n");
			estatistica.incrementarChamadasCompletadas();
			break;
		}
	}

}
