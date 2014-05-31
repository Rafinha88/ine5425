package modelo;

public class Fim extends Evento {

	public Fim(int id, Chamada chamada, long tempo) {
		super(id, chamada, tempo);
	}

	// TODO: Implementar
	@Override
	public void executar() {

	}

	/**
	 * Sempre no final da fila.
	 */
	@Override
	public int compareTo(Evento o) {
		return -1;
	}

}
