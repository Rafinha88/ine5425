package modelo;

public class Saida extends Evento {

	public Saida(int id, Chamada chamada, long tempo) {
		super(id, chamada, tempo);
	}

	@Override
	public void executar() {
		getChamada().finalizar();
		coletarEstatisticas();
	}

	// TODO: Implementar
	public void coletarEstatisticas() {

	}

}
