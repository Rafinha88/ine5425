package modelo;

public class Celula {

	private final String nome;
	// Importante para manter estatisticas.
	private final int numeroDeCanais;
	private int canaisDisponiveis;
	//TODO: Verificar em como manter a estátistica. 
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
	 * @return True caso tenha canal disponível
	 */
	public boolean ocuparCanal() {
		if (canaisDisponiveis >= 1) {
			canaisDisponiveis--;
			return true;
		}
		return false;
	}

	/**
	 * Método para evitar a situação em que o número de canais disponível seja maior que o número de canais 
	 * @return True quando ocorrer desocupação de canal
	 */
	public boolean desocuparCanal() {
		if (canaisDisponiveis < numeroDeCanais) {
			canaisDisponiveis++;
			return true;
		}
		return false;
	}

}
