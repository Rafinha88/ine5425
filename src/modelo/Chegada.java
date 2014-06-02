package modelo;

import modelo.Chamada;
import modelo.Estatistica;
import modelo.Evento;
import modelo.TrocaDeCelula;

public class Chegada extends Evento {

	public Chegada(Chamada chamada, long tempo) {
		super(chamada, tempo);
	}

	@Override
	public Evento executar() {
		getChamada().iniciar();
		Evento evento = new TrocaDeCelula(getChamada(), getTempo()
				+ (getChamada().getDuracao() / 2));
		coletarEstatisticas();
		return evento;
	}

	// TODO: Pensar em como gerar as estatisticas
	private void coletarEstatisticas() {
		Estatistica.getInstance().incrementarChamadasNoSistema();
                Estatistica.getInstance().atualizarMaiorNumeroDeChamadasNoSitema();
	}

}
