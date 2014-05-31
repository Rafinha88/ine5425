package modelo;

public class Chegada extends Evento {

	public Chegada(int id, Chamada chamada, long tempo) {
		super(id, chamada, tempo);
	}

	@Override
	public void executar() {
		getChamada().iniciar();
		gerarProximaChegada();
		coletarEstatisticas();
	}

	// TODO: Implementar
	private Evento gerarProximaChegada() {
		return new Chegada(0, null, 0);
	}

	// TODO: Pensar em como gerar as estatisticas
	private void coletarEstatisticas() {

	}

}
