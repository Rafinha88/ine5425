package modelo;

public class Celula {

	private final String nome;
	// Importante para manter estatisticas.
	private final int numeroDeCanais;
	private int canaisDisponiveis;
	//TODO: Verificar em como manter a est�tistica. 
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
	 * @return True caso tenha canal dispon�vel
	 */
	public boolean ocuparCanal() {
		if (canaisDisponiveis >= 1) {
			canaisDisponiveis--;
			return true;
		}
		return false;
	}

	/**
	 * M�todo para evitar a situa��o em que o n�mero de canais dispon�vel seja maior que o n�mero de canais 
	 * @return True quando ocorrer desocupa��o de canal
	 */
	public boolean desocuparCanal() {
		if (canaisDisponiveis < numeroDeCanais) {
			canaisDisponiveis++;
			return true;
		}
		return false;
	}

}
