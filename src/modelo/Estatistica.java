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

	// Estes dois atributos s�o essenciais para calcular o tempo m�dio de
	// chamada.
	private long tempoTotalDeChamadas;
	private int numeroDeChamadasRealizadas;

	/**
	 * Verifica se o tempo � algum dos extremos. O menor tempo de chamada ou o
	 * maior. Tamb�m calcula o tempo m�dio da chamada utilizando um contador
	 * para numero de chamadas j� feitas e o tempo total de chamadas
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
