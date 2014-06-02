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

	private double[] historicoDeTaxaDeOcupacaoDeC1;
	private int controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC1;
	private double[] historicoDeTaxaDeOcupacaoDeC2;
	private int controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC2;

	private long maiorNumeroDeChamadasNoSistema;
	private long mediaDeChamadasNoSistema;

	// Estes dois atributos s�o essenciais para calcular o tempo m�dio de
	// chamada.
	private long tempoTotalDeChamadas;
	private int numeroDeChamadasRealizadas;

	public int getNumeroDeCanaisOcupadosDeC1() {
		Celula c1 = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		return c1.getNumeroDeCanais() - c1.getCanaisDisponiveis();
	}

	public double getTaxaMediaDeOcupacaoDeC1() {
		double soma = 0;
		int quantidadeDeTaxasDifentesDeZero = 0;
		for (double historico : historicoDeTaxaDeOcupacaoDeC1) {
			if (historico != 0) {
				quantidadeDeTaxasDifentesDeZero++;
				soma += historico;
			}
		}
		Celula c1 = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		double taxaAtual = (double) (c1.getNumeroDeCanais() - c1
				.getCanaisDisponiveis()) / c1.getNumeroDeCanais();
		double novaMedia = (double) (taxaAtual + soma)
				/ (quantidadeDeTaxasDifentesDeZero + 1);
		historicoDeTaxaDeOcupacaoDeC1[controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC1] = novaMedia;

		if (controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC1 == 9) {
			controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC1 = 0;
		} else {
			controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC1++;
		}
		return novaMedia;
	}

	public int getNumeroDeCanaisOcupadosDeC2() {
		Celula c2 = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		return c2.getNumeroDeCanais() - c2.getCanaisDisponiveis();
	}

	public double getTaxaMediaDeOcupacaoDeC2() {
		double soma = 0;
		int quantidadeDeTaxasDifentesDeZero = 0;
		for (double historico : historicoDeTaxaDeOcupacaoDeC2) {
			if (historico != 0) {
				quantidadeDeTaxasDifentesDeZero++;
				soma += historico;
			}
		}
		Celula c2 = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		double taxaAtual = (double) (c2.getNumeroDeCanais() - c2
				.getCanaisDisponiveis()) / c2.getNumeroDeCanais();
		double novaMedia = (double) (taxaAtual + soma)
				/ (quantidadeDeTaxasDifentesDeZero + 1);
		historicoDeTaxaDeOcupacaoDeC2[controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC2] = novaMedia;

		if (controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC2 == 9) {
			controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC2 = 0;
		} else {
			controleDoIndiceParaHistoricoDeTaxaDeOcupacaoC2++;
		}
		return novaMedia;
	}

	private static Estatistica instance;

	private Estatistica() {
		menorTempoDeChamada = 0;
		maiorTempoDeChamada = 0;
		maiorNumeroDeChamadasNoSistema = 0;
		historicoDeTaxaDeOcupacaoDeC1 = new double[10];
		historicoDeTaxaDeOcupacaoDeC2 = new double[10];
	}

	public static Estatistica getInstance() {
		if (instance == null) {
			instance = new Estatistica();
		}
		return instance;
	}

	/**
	 * Verifica se o tempo � algum dos extremos. O menor tempo de chamada ou o
	 * maior. Tamb�m calcula o tempo m�dio da chamada utilizando um contador
	 * para numero de chamadas j� feitas e o tempo total de chamadas
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

	public long getMaiorNumeroDeChamadasNoSistema() {
		return maiorNumeroDeChamadasNoSistema;
	}

	public long getMediaDeChamadasNoSistema() {
		return mediaDeChamadasNoSistema;
	}

	public void setMaiorNumeroDeChamadasNoSistema(long maior) {
		this.maiorNumeroDeChamadasNoSistema = maior;
	}

	public void atualizarMaiorNumeroDeChamadasNoSitema() {
		if (chamadasNoSistema > maiorNumeroDeChamadasNoSistema) {
			setMaiorNumeroDeChamadasNoSistema(chamadasNoSistema);
		}
	}

}
