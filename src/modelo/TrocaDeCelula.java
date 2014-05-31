package modelo;

public class TrocaDeCelula extends Evento {

	public TrocaDeCelula(Chamada chamada, long tempo) {
		super(chamada, tempo);
	}

	@Override
	public Evento executar() {
		getChamada().trocarCelula();
		Evento evento = null;

		if (getChamada().getEstado() == EstadoDaChamada.EXECUTANDO) {
			evento = new Saida(getChamada(), getChamada().getDuracao()
					+ getTempo());
		} else {
			evento = new Saida(getChamada(), getTempo());
		}
		return evento;
	}

}
