package modelo;

import modelo.Chamada;
import modelo.EstadoDaChamada;
import modelo.Evento;
import modelo.Saida;

public class TrocaDeCelula extends Evento {

	public TrocaDeCelula(Chamada chamada, long tempo) {
		super(chamada, tempo);
	}

	@Override
	public Evento executar() {
		getChamada().trocarCelula();
		Evento evento = null;
		System.err.println("Executando saida");
		if (getChamada().getEstado() == EstadoDaChamada.EXECUTANDO) {
			System.err.println("Gerando saida normal");
			evento = new Saida(getChamada(), getChamada().getDuracao()
					+ getTempo());
		} else {
			System.err.println("Gerando saida imediata");
			evento = new Saida(getChamada(), getTempo());
		}
		return evento;
	}

}
