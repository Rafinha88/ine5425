package modelo;

import java.util.Random;

import org.apache.commons.math3.distribution.RealDistribution;

public class GeradorDeChamada {

	private final RealDistribution distribuicaoEmC1;
	private final int probabilidadeDeGerarC1C1;
	private final int probabilidadeDeGerarC1C2;
	// Atributo abaixo pode ser retirado? É o complemento dos c1c1 e c1c2.
	private final int probabilidadeDeGerarC1FA;

	private final RealDistribution distribuicaoEmC2;
	private final int probabilidadeDeGerarC2C1;
	private final int probabilidadeDeGerarC2C2;
	private final int probabilidadeDeGerarC2FA;

	private final Random aleatorio;

	public GeradorDeChamada(RealDistribution distribuicaoEmC1,
			int probabilidadeDeGerarC1C1, int probabilidadeDeGerarC1C2,
			int probabilidadeDeGerarC1FA, RealDistribution distribuicaoEmC2,
			int probabilidadeDeGerarC2C1, int probabilidadeDeGerarC2C2,
			int probabilidadeDeGerarC2FA) {
		super();
		this.distribuicaoEmC1 = distribuicaoEmC1;
		this.probabilidadeDeGerarC1C1 = probabilidadeDeGerarC1C1;
		this.probabilidadeDeGerarC1C2 = probabilidadeDeGerarC1C2;
		this.probabilidadeDeGerarC1FA = probabilidadeDeGerarC1FA;
		this.distribuicaoEmC2 = distribuicaoEmC2;
		this.probabilidadeDeGerarC2C1 = probabilidadeDeGerarC2C1;
		this.probabilidadeDeGerarC2C2 = probabilidadeDeGerarC2C2;
		this.probabilidadeDeGerarC2FA = probabilidadeDeGerarC2FA;
		aleatorio = new Random();
	}

	public Chamada gerarChamadaEmC1(long tempo) {
		double proximoAleatorio = aleatorio.nextDouble();
		Chamada chamada = null;
		Celula origem = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		Celula c2 = CelulaSingletonBuilder.getInstance().constroiOuGetC2();

		long duracao = 0;

		if (proximoAleatorio < probabilidadeDeGerarC1C1) {
			chamada = new Chamada(origem, origem, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC1C1
				+ probabilidadeDeGerarC1C2) {
			chamada = new Chamada(origem, c2, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC1FA) {
			// TODO: Pensar na maneira correta de tratar com o fora de sinal.
			chamada = new Chamada(origem, null, duracao, tempo);
		}
		return chamada;
	}

	public Chamada gerarChamadaEmC2(long tempo) {
		double proximoAleatorio = aleatorio.nextDouble();
		Chamada chamada = null;
		Celula origem = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		Celula c1 = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		long duracao = 0;
		if (proximoAleatorio < probabilidadeDeGerarC1C1) {
			chamada = new Chamada(origem, origem, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC1C1
				+ probabilidadeDeGerarC1C2) {
			chamada = new Chamada(origem, c1, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC2FA) {
			// TODO: Pensar na maneira correta de tratar com o fora de sinal.
			chamada = new Chamada(origem, null, duracao, tempo);
		}
		return chamada;
	}

}
