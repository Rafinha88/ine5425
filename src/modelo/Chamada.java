package modelo;

import modelo.Celula;
import modelo.EstadoDaChamada;

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
		System.out.printf("Chamada | Iniciando \n");
		if (celulaOrigem.ocuparCanal()) {
			estado = EstadoDaChamada.EXECUTANDO;
		} else {
			estado = EstadoDaChamada.SEM_CANAL;
		}
	}

	public void trocarCelula() {
		System.out.printf("Chamada | Trocando Celula \n");
		celulaOrigem.desocuparCanal();
		if (celulaDestino != null) {
			if (celulaDestino.ocuparCanal()) {
				estado = EstadoDaChamada.EXECUTANDO;
			} else {
				estado = EstadoDaChamada.SEM_CANAL;
			}
		} else {
			estado = EstadoDaChamada.SEM_SINAL;
		}
	}

	public void finalizar() {
		System.out.printf("Chamada | Finalizando \n");
		if (estado == EstadoDaChamada.EXECUTANDO) {
			celulaDestino.desocuparCanal();
			estado = EstadoDaChamada.SUCESSO;
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
