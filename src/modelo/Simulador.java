package modelo;

import org.apache.commons.math3.distribution.NormalDistribution;

public class Simulador {

	// TODO: Adicionar os atributos recebidos pela view de configura��o do
	// operador.

	static Relogio relogio;
	static Gerador gerador;
	static Estatistica estatistica;
	static ListaEncadeadaOrdenada<Evento> eventos;

	static boolean pausado = false;

	private static int numeroDePassosDeExecucao;

	public static void main(String[] args) {
		setup();
		loop();
	}

	private static void setup() {
		eventos = new ListaEncadeadaOrdenada<>();
		relogio = new Relogio();
		estatistica = Estatistica.getInstance();
		// TODO: Adicionar gerador com os dados da view
		gerador = null;
	}

	private static void loop() {
		// TODO: Implementar pausa etc.
		while (!pausado) {
			int contador = 0;
			while (contador != numeroDePassosDeExecucao) {
				avancarTempo();
				executarEvento();
				contador++;
			}
			mostrarEstatisticas();

		}
	}

	private static void avancarTempo() {
		relogio.avancarPara(eventos.get(0).getTempo());
	}

	private static void executarEvento() {
		Evento evento = eventos.pop();
		if (evento instanceof Chegada) {
			eventos.adicionarOrdenado(gerador.gerarProximaChegadaC1(relogio
					.getTempo()));
			eventos.adicionarOrdenado(gerador.gerarProximaChegadaC2(relogio
					.getTempo()));
		}
		Evento novoEvento = evento.executar();
		if (novoEvento != null) {
			eventos.adicionarOrdenado(novoEvento);
		}
	}

	private static void mostrarEstatisticas() {

	}

}
