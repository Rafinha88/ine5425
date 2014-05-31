package modelo;

public class Estatistica {

	// Bloco apenas contador
	private long numeroDeChamadasNoSistema;
	private long numeroDeChamadasFinalizadas;
	private long numeroDeChamadasFalhadas;
	private long numeroDeChamdasPerdidasNoDeslocamento;

	// Bloco que necessita de calculos.
	private long menorTempoDeChamada;
	private long tempoMedioDeChamada;
	private long maiorTempoDeChamada;
	private long taxaMediaDeOcupacao;

	// Estes dois atributos são essenciais para calcular o tempo médio de
	// chamada.
	private long tempoTotalDeChamadas;
	private int numeroDeChamadasRealizadas;

	/**
	 * Verifica se o tempo é algum dos extremos. O menor tempo de chamada ou o
	 * maior. Também calcula o tempo médio da chamada utilizando um contador
	 * para numero de chamadas já feitas e o tempo total de chamadas
	 * 
	 * @param tempo
	 */
	public void analisarTempoDaChamada(long tempo) {
		numeroDeChamadasRealizadas++;
		if (tempo < menorTempoDeChamada) {
			menorTempoDeChamada = tempo;
		} else if (tempo > maiorTempoDeChamada) {
			maiorTempoDeChamada = tempo;
		}
		tempoTotalDeChamadas += tempo;
		tempoMedioDeChamada = tempoTotalDeChamadas / numeroDeChamadasRealizadas;

	}

	public long getNumeroDeChamadasNoSistema() {
		return numeroDeChamadasNoSistema;
	}

	public void setNumeroDeChamadasNoSistema(long numeroDeChamadasNoSistema) {
		this.numeroDeChamadasNoSistema = numeroDeChamadasNoSistema;
	}

	public long getNumeroDeChamadasFinalizadas() {
		return numeroDeChamadasFinalizadas;
	}

	public void setNumeroDeChamadasFinalizadas(long numeroDeChamadasFinalizadas) {
		this.numeroDeChamadasFinalizadas = numeroDeChamadasFinalizadas;
	}

	public long getNumeroDeChamadasFalhadas() {
		return numeroDeChamadasFalhadas;
	}

	public void setNumeroDeChamadasFalhadas(long numeroDeChamadasFalhadas) {
		this.numeroDeChamadasFalhadas = numeroDeChamadasFalhadas;
	}

	public long getNumeroDeChamdasPerdidasNoDeslocamento() {
		return numeroDeChamdasPerdidasNoDeslocamento;
	}

	public void setNumeroDeChamdasPerdidasNoDeslocamento(
			long numeroDeChamdasPerdidasNoDeslocamento) {
		this.numeroDeChamdasPerdidasNoDeslocamento = numeroDeChamdasPerdidasNoDeslocamento;
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
