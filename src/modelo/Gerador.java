package modelo;

import java.util.Random;
import org.apache.commons.math3.distribution.EnumeratedRealDistribution;
import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.TriangularDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

public class Gerador {

	private final RealDistribution funcaoTempoC1;
	double mediaChegadaDeChamadaC1;
	private final int probabilidadeDeGerarC1C1;
	private final int probabilidadeDeGerarC1C2;
	// Atributo abaixo pode ser retirado? � o complemento dos c1c1 e c1c2.
	private final int probabilidadeDeGerarC1FA;

	private final RealDistribution funcaoTempoC2;
	double mediaChegadaDeChamadaC2;
	private final int probabilidadeDeGerarC2C1;
	private final int probabilidadeDeGerarC2C2;
	private final int probabilidadeDeGerarC2FA;

	private final Random aleatorio;
	private final RealDistribution distribuicaoDuracaoChamada;

	public Gerador(double mediaChegadaDeChamadaC1,
			int probabilidadeDeGerarC1C1, int probabilidadeDeGerarC1C2,
			int probabilidadeDeGerarC1FA, double mediaChegadaDeChamadaC2,
			int probabilidadeDeGerarC2C1, int probabilidadeDeGerarC2C2,
			int probabilidadeDeGerarC2FA, String funcaoDeProbabilidade,
			double parametro1, double parametro2, double parametro3) {
		super();
		this.mediaChegadaDeChamadaC1 = mediaChegadaDeChamadaC1;
		this.probabilidadeDeGerarC1C1 = probabilidadeDeGerarC1C1;
		this.probabilidadeDeGerarC1C2 = probabilidadeDeGerarC1C2;
		this.probabilidadeDeGerarC1FA = probabilidadeDeGerarC1FA;
		this.mediaChegadaDeChamadaC2 = mediaChegadaDeChamadaC2;
		this.probabilidadeDeGerarC2C1 = probabilidadeDeGerarC2C1;
		this.probabilidadeDeGerarC2C2 = probabilidadeDeGerarC2C2;
		this.probabilidadeDeGerarC2FA = probabilidadeDeGerarC2FA;
		aleatorio = new Random();
		this.funcaoTempoC1 = new ExponentialDistribution(
				mediaChegadaDeChamadaC1);
		this.funcaoTempoC2 = new ExponentialDistribution(
				mediaChegadaDeChamadaC2);

		distribuicaoDuracaoChamada = setFuncaoDeProbabilidade(
				funcaoDeProbabilidade, parametro1, parametro2, parametro3);
	}

	private RealDistribution setFuncaoDeProbabilidade(
			String funcaoDeProbabilidade, double parametro1, double parametro2,
			double parametro3) {

		double[] valores = { parametro1 };
		double[] probabilidades = { 1 };

		switch (funcaoDeProbabilidade) {
		case "Normal":
			return new NormalDistribution(parametro1, parametro2);
		case "Uniforme":
			return new UniformRealDistribution(parametro1, parametro2);
		case "Exponencial":
			return new ExponentialDistribution(parametro1);
		case "Triangular":
			return new TriangularDistribution(parametro1, parametro2,
					parametro3);
		default:
			return new EnumeratedRealDistribution(valores, probabilidades);
		}
	}

	private Chamada gerarChamadaEmC1(long tempo) {
		double proximoAleatorio = aleatorio.nextDouble() * 100;
		Chamada chamada = null;
		Celula origem = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		Celula c2 = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		long duracao = (long) distribuicaoDuracaoChamada.sample();
		System.out.printf("Gerador | duracao c1 = %s\n", duracao);

		if (proximoAleatorio < probabilidadeDeGerarC1C1) {
			chamada = new Chamada(origem, origem, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC1C1
				+ probabilidadeDeGerarC1C2) {
			chamada = new Chamada(origem, c2, duracao, tempo);
		} else if (proximoAleatorio > probabilidadeDeGerarC1C1
				+ probabilidadeDeGerarC1C2) {
			// TODO: Pensar na maneira correta de tratar com o fora de sinal.
			chamada = new Chamada(origem, null, duracao, tempo);
		}
		return chamada;
	}

	private Chamada gerarChamadaEmC2(long tempo) {
		double proximoAleatorio = aleatorio.nextDouble() * 100;
		Chamada chamada = null;
		Celula origem = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		Celula c1 = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		long duracao = (long) distribuicaoDuracaoChamada.sample();
		System.out.printf("Gerador | duracao c2 = %s\n", duracao);
		if (proximoAleatorio < probabilidadeDeGerarC2C1) {
			chamada = new Chamada(origem, origem, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC2C1
				+ probabilidadeDeGerarC2C2) {
			chamada = new Chamada(origem, c1, duracao, tempo);
		} else if (proximoAleatorio > probabilidadeDeGerarC2C1
				+ probabilidadeDeGerarC2C2) {
			// TODO: Pensar na maneira correta de tratar com o fora de sinal.
			chamada = new Chamada(origem, null, duracao, tempo);
		}
		return chamada;
	}

	public Chegada gerarProximaChegadaC1(long tempo) {
		Chegada proximaChegadaC1;
		Chamada chamadaEmC1 = gerarChamadaEmC1(tempo);

		long tempoDaProximaChegadaC1 = tempo + (long) funcaoTempoC1.sample();
		System.err.printf("Gerador | Tempo para proxima chegada = %s%n",
				tempoDaProximaChegadaC1);
		proximaChegadaC1 = new Chegada(chamadaEmC1, tempoDaProximaChegadaC1);
		return proximaChegadaC1;
	}

	public Chegada gerarProximaChegadaC2(long tempo) {
		Chegada proximaChegadaC2;
		Chamada chamadaEmC2 = gerarChamadaEmC2(tempo);

		long tempoDaProximaChegadaC2 = tempo + (long) funcaoTempoC2.sample();
		proximaChegadaC2 = new Chegada(chamadaEmC2, tempoDaProximaChegadaC2);
		return proximaChegadaC2;
	}

}
