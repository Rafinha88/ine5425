package modelo;

import java.util.Random;
import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

public class GeradorDeChamada {

	private final RealDistribution distribuicaoEmC1;
        double mediaChegadaDeChamadaC1;
	private final int probabilidadeDeGerarC1C1;
	private final int probabilidadeDeGerarC1C2;
	// Atributo abaixo pode ser retirado? � o complemento dos c1c1 e c1c2.
	private final int probabilidadeDeGerarC1FA;

	private final RealDistribution distribuicaoEmC2;
        double mediaChegadaDeChamadaC2;
	private final int probabilidadeDeGerarC2C1;
	private final int probabilidadeDeGerarC2C2;
	private final int probabilidadeDeGerarC2FA;

	private final Random aleatorio;

	public GeradorDeChamada(double mediaChegadaDeChamadaC1,
			int probabilidadeDeGerarC1C1, int probabilidadeDeGerarC1C2,
			int probabilidadeDeGerarC1FA, double mediaChegadaDeChamadaC2,
			int probabilidadeDeGerarC2C1, int probabilidadeDeGerarC2C2,
			int probabilidadeDeGerarC2FA) {
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
                this.distribuicaoEmC1 = new ExponentialDistribution(mediaChegadaDeChamadaC1);
                this.distribuicaoEmC2 = new ExponentialDistribution(mediaChegadaDeChamadaC2);
	}

	public Chamada gerarChamadaEmC1(long tempo) {
		double proximoAleatorio = aleatorio.nextDouble();
		Chamada chamada = null;
		Celula origem = CelulaSingletonBuilder.getInstance().constroiOuGetC1();
		Celula c2 = CelulaSingletonBuilder.getInstance().constroiOuGetC2();
		long duracao = (long) distribuicaoEmC1.sample();

		if (proximoAleatorio < probabilidadeDeGerarC1C1) {
			chamada = new Chamada(origem, origem, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC1C1 + probabilidadeDeGerarC1C2) {
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
		long duracao = (long) distribuicaoEmC2.sample();
                
		if (proximoAleatorio < probabilidadeDeGerarC2C1) {
			chamada = new Chamada(origem, origem, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC2C2 + probabilidadeDeGerarC1C2) {
			chamada = new Chamada(origem, c1, duracao, tempo);
		} else if (proximoAleatorio < probabilidadeDeGerarC2FA) {
			// TODO: Pensar na maneira correta de tratar com o fora de sinal.
			chamada = new Chamada(origem, null, duracao, tempo);
		}
		return chamada;
	}

}
