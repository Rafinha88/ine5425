package modelo;

public class Chamada {

	private Celula celulaOrigem;
	private Celula celulaDestino;
	private long duracao;
	private long tempoEmQueSeRealizou;
	private EstadoDaChamada estado;

	Chamada(Celula origem, Celula destino, long duracao,
			long tempoEmQueSeRealizou) {
		this.celulaOrigem = origem;
		this.celulaDestino = destino;
		this.duracao = duracao;
		this.tempoEmQueSeRealizou = tempoEmQueSeRealizou;
	}

	public void iniciar() {
		if (celulaOrigem.ocuparCanal()) {

		} else {
			estado = EstadoDaChamada.SEM_SINAL;
		}
	}

	public void finalizar() {
		// Protege contra null do fora de área
		if (celulaDestino != null) {
			celulaDestino.desocuparCanal();
			estado = EstadoDaChamada.SUCESSO;
		} else {
			estado = EstadoDaChamada.SEM_SINAL;
		}
	}

	public Celula getCelulaOrigem() {
		return this.celulaOrigem;
	}

	public void setCelulaOrigem(Celula origem) {
		this.celulaOrigem = origem;
	}

	public Celula getCelulaDestino() {
		return this.celulaDestino;
	}

	public void setCelulaDestino(Celula destino) {
		this.celulaDestino = destino;
	}

	public long getDuracao() {
		return this.duracao;
	}

	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}

	public long getTempoQueSeRealizou() {
		return this.tempoEmQueSeRealizou;
	}

	public void setTempoQueSeRealizou(long tempoQueSeRealizou) {
		this.tempoEmQueSeRealizou = tempoQueSeRealizou;
	}

	public EstadoDaChamada getEstado() {
		return estado;
	}

}
