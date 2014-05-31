package modelo;

public class Relogio {

	private long tempo;

	public Relogio() {
		tempo = 0;
	}

	public long getTempo() {
		return tempo;
	}

	public void avancarEm(long tempo) {
		this.tempo += tempo;
	}

}
