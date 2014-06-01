package modelo;

import modelo.Estatistica;

public class Estatistica {

	// Bloco apenas contador
	private int chamadasNoSistema;
	private int chamadasCompletadas;
	private int chamadasSemSinal;
	private int chamadaPerdidaFaltaDeCanalC1;
	private int chamadaPerdidaFaltaDeCanalC2;

	// Bloco que necessita de calculos.
	private long menorTempoDeChamada;
	private long tempoMedioDeChamada;
	private long maiorTempoDeChamada;
	private long taxaMediaDeOcupacao;

	private long taxaMediaDeOcupacaoDeC1;
	private long taxaMediaDeOcupacaoDeC2;

	// Estes dois atributos são essenciais para calcular o tempo médio de
	// chamada.
	private long tempoTotalDeChamadas;
	private int numeroDeChamadasRealizadas;

	public int getNumeroDeCanaisOcupadosDeC1() {
		Celula c1 = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		return c1.getNumeroDeCanais() - c1.getCanaisDisponiveis();
	}

	public long getTaxaMediaDeOcupacaoDeC1() {
		return taxaMediaDeOcupacaoDeC1;
	}

	public int getNumeroDeCanaisOcupadosDeC2() {
		Celula c2 = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		return c2.getNumeroDeCanais() - c2.getCanaisDisponiveis();
	}

	public long getTaxaMediaDeOcupacaoDeC2() {
		return taxaMediaDeOcupacaoDeC2;
	}

	private static Estatistica instance;

	private Estatistica() {
		menorTempoDeChamada = 0;
		maiorTempoDeChamada = 0;
	}

	public static Estatistica getInstance() {
		if (instance == null) {
			instance = new Estatistica();
		}
		return instance;
	}

	/**
	 * Verifica se o tempo é algum dos extremos. O menor tempo de chamada ou o
	 * maior. Também calcula o tempo médio da chamada utilizando um contador
	 * para numero de chamadas já feitas e o tempo total de chamadas
	 * 
	 * @param tempo
	 */
	public void analisarTempoDaChamada(long tempo) {
		numeroDeChamadasRealizadas++;
		if (tempo < menorTempoDeChamada | menorTempoDeChamada == 0) {
			menorTempoDeChamada = tempo;
		} else if (tempo > maiorTempoDeChamada | maiorTempoDeChamada == 0) {
			maiorTempoDeChamada = tempo;
		}
		tempoTotalDeChamadas += tempo;
		tempoMedioDeChamada = tempoTotalDeChamadas / numeroDeChamadasRealizadas;

	}

	public void incrementarChamadasNoSistema() {
		chamadasNoSistema++;
	}

	public void decrementarNumeroDeChamadasNoSistema() {
		chamadasNoSistema--;
	}

	public void incrementarChamadasCompletadas() {
		chamadasCompletadas++;
	}

	public void incrementarChamadasSemSinal() {
		chamadasSemSinal++;
	}

	public void incrementarChamadaPerdidaFaltaDeCanalC1() {
		chamadaPerdidaFaltaDeCanalC1++;
	}

	public void incrementarChamadaPerdidaFaltaDeCanalC2() {
		chamadaPerdidaFaltaDeCanalC2++;
	}

	public int getChamadasNoSistema() {
		return chamadasNoSistema;
	}

	public int getChamadasCompletadas() {
		return chamadasCompletadas;
	}

	public int getChamadasSemSinal() {
		return chamadasSemSinal;
	}

	public int getChamadaPerdidaFaltaDeCanalC1() {
		return chamadaPerdidaFaltaDeCanalC1;
	}

	public int getChamadaPerdidaFaltaDeCanalC2() {
		return chamadaPerdidaFaltaDeCanalC2;
	}

	public long getMenorTempoDeChamada() {
		return menorTempoDeChamada;
	}

	public long getTempoMedioDeChamada() {
		return tempoMedioDeChamada;
	}

	public long getMaiorTempoDeChamada() {
		return maiorTempoDeChamada;
	}

	public long getTaxaMediaDeOcupacao() {
		return taxaMediaDeOcupacao;
	}

	public long getTempoTotalDeChamadas() {
		return tempoTotalDeChamadas;
	}

	public int getNumeroDeChamadasRealizadas() {
		return numeroDeChamadasRealizadas;
	}

}
