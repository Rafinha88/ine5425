package modelo;

public abstract class Evento implements Comparable<Evento> {

	private int id;
	private Chamada chamada;
	private long tempo;

	public Evento(int id, Chamada chamada, long tempo) {
		this.id = id;
		this.chamada = chamada;
		this.tempo = tempo;
	}

	public int getId() {
		return id;
	}

	public Chamada getChamada() {
		return chamada;
	}

	public long getTempo() {
		return tempo;
	}

	@Override
	public int compareTo(Evento o) {
		long outroTempo = o.getTempo();
		if (tempo < outroTempo) {
			return -1;
		} else if (tempo == outroTempo) {
			return 0;
		} else {
			return 1;
		}
	}

	public abstract void executar();

}
