package modelo;

public class Celula {

	private final String nome;
	// Importante para manter estatisticas.
	private final int numeroDeCanais;
	private int canaisDisponiveis;
	//TODO: Verificar em como manter a estatistica. 
	private double taxaMediaOcupacao;

	public Celula(String nome, int canais) {
		this.nome = nome;
		this.numeroDeCanais = canais;
		this.canaisDisponiveis = canais;
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumeroDeCanais() {
		return numeroDeCanais;
	}

	public int getCanaisDisponiveis() {
		return this.canaisDisponiveis;
	}

	public double getTaxaMediaOcupacao() {
		return this.taxaMediaOcupacao;
	}

	/**
	 * @return True caso tenha canal disponivel
	 */
	public boolean ocuparCanal() {
		if (canaisDisponiveis >= 1) {
			canaisDisponiveis--;
			return true;
		}
		return false;
	}

	/**
	 * Metodo para evitar a situacao em que o numero de canais disponivel seja maior que o numero de canais 
	 * @return True quando ocorrer desocupacaode canal
	 */
	public boolean desocuparCanal() {
		if (canaisDisponiveis < numeroDeCanais) {
			canaisDisponiveis++;
			return true;
		}
		return false;
	}

}
