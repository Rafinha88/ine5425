package modelo;

public class CelulaSingletonBuilder {

	private Celula c1;
	private String nomeDoC1;
	private int numeroDeCanaisDoC1;
	private static boolean c1JaCriado;

	private Celula c2;
	private String nomeDoC2;
	private int numeroDeCanaisDoC2;
	private boolean c2JaCriado;

	private static CelulaSingletonBuilder instance;

	/**
	 * Protege para utilizar o getInstance
	 */
	private CelulaSingletonBuilder() {

	}

	/**
	 * Padrão de projeto singleton
	 */
	public static CelulaSingletonBuilder getInstance() {
		if (instance == null) {
			instance = new CelulaSingletonBuilder();
		}
		return instance;
	}

	public void comNomeDoC1(String nome) {
		this.nomeDoC1 = nome;
	}

	public void comNumeroDeCanaisDoC1(int numeroDeCanais) {
		this.numeroDeCanaisDoC1 = numeroDeCanais;
	}
	

	public static boolean isC1JaCriado() {
		return c1JaCriado;
	}
	
	/**
	 * Garante que o c1 será o mesmo em toda a aplicação. Singleton "simulado".
	 * 
	 * @return Celula c1
	 */
	public Celula constroiOuGetC1() {
		if (c1 == null) {
			c1JaCriado = true;
			return new Celula(nomeDoC1, numeroDeCanaisDoC1);
		} else {
			return c1;
		}
	}

	public void comNomeDoC2(String nome) {
		this.nomeDoC2 = nome;
	}

	public void comNumeroDeCanaisDoC2(int numeroDeCanais) {
		this.numeroDeCanaisDoC2 = numeroDeCanais;
	}
	
	public boolean isC2JaCriado() {
		return c2JaCriado;
	}

	/**
	 * Garante que o c1 será o mesmo em toda a aplicação. Singleton "simulado".
	 * 
	 * @return Celula c1
	 */
	public Celula constroiOuGetC2() {
		if (c2 == null) {
			c2JaCriado = true;
			return new Celula(nomeDoC2, numeroDeCanaisDoC2);
		} else {
			return c2;
		}
	}
}
