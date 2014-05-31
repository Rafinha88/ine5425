package modelo;

import modelo.Chegada;
import modelo.Estatistica;
import modelo.Evento;
import modelo.GeradorDeChamada;
import modelo.ListaEncadeadaOrdenada;
import modelo.Relogio;

public class Simulador {

	// TODO: Adicionar os atributos recebidos pela view de configuração do
	// operador.

	static Relogio relogio;
	static GeradorDeChamada geradorDeChamada;
	static Estatistica estatistica;
	static ListaEncadeadaOrdenada<Evento> eventos;

	static boolean pausado = false;

	public static void main(String[] args) {
		setup();
		loop();
	}

	private static void setup() {
		eventos = new ListaEncadeadaOrdenada<>();
		relogio = new Relogio();
		estatistica = Estatistica.getInstance();
		// TODO: Adicionar gerador com os dados da view
		geradorDeChamada = null;
	}

	private static void loop() {
		// TODO: Implementar pausa etc.
		while (!pausado) {
			avancarTempo();
			executarEvento();
			mostrarEstatisticas();
		}
	}

	private static void avancarTempo() {
		relogio.avancarPara(eventos.get(0).getTempo());
	}

	private static void executarEvento() {
		Evento evento = eventos.pop();
		if (evento instanceof Chegada) {
			geradorDeChamada.gerarChamadaEmC1(0);
		}
		Evento novoEvento = evento.executar();
		if (novoEvento != null) {
			eventos.adicionarOrdenado(novoEvento);
		}
	}

	private static void mostrarEstatisticas() {

	}

}
