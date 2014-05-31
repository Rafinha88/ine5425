package modelo;

import modelo.Chamada;
import modelo.Evento;

public abstract class Evento implements Comparable<Evento> {

	private Chamada chamada;
	private long tempo;

	public Evento(Chamada chamada, long tempo) {
		this.chamada = chamada;
		this.tempo = tempo;
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

	public abstract Evento executar();

}
