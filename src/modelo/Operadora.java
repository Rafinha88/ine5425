package modelo;

import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.TriangularDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

public class Operadora {

	// Utilizar como singleton.
	private final Celula c1;
	private final Celula c2;

	// estatiscas para serem coletadas
	int chamadasCompletadas;
	int chamadaPerdidaC1;
	int chamadaPerdidaC2;
	int chamadaPerdidaFA;

	private RealDistribution funcaoDeProbabilidadeDuracaoDasChamadas;

	public Operadora(Celula c1, Celula c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public Celula getC1() {
		return c1;
	}

	public Celula getC2() {
		return c2;
	}

	public void setFuncaoDeProbabilidade(String funcaoDeProbabilidade,
			double parametro1, double parametro2, double parametro3) {
		switch (funcaoDeProbabilidade) {
		case "Normal":
			this.funcaoDeProbabilidadeDuracaoDasChamadas = new NormalDistribution(
					parametro1, parametro2);
			break;
		case "Uniforme":
			this.funcaoDeProbabilidadeDuracaoDasChamadas = new UniformRealDistribution(
					parametro1, parametro2);
			break;
		case "Exponencial":
			this.funcaoDeProbabilidadeDuracaoDasChamadas = new ExponentialDistribution(
					parametro1);
			break;
		case "Triangular":
			this.funcaoDeProbabilidadeDuracaoDasChamadas = new TriangularDistribution(
					parametro1, parametro2, parametro3);
			break;
		case "Constante":
		}
	}

}
