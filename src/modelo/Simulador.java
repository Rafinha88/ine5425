package modelo;


public class Simulador {

	// TODO: Adicionar os atributos recebidos pela view de configura��o do
	// operador.

	static Relogio relogio;
	static Gerador geradorDeChamada;
	static Estatistica estatistica;
	static ListaEncadeadaOrdenada<Evento> eventos;

	public static void main(String[] args) {
		setup();
		loop();
	}

	private static void setup() {
		eventos = new ListaEncadeadaOrdenada<>();
		relogio = new Relogio();
		estatistica = new Estatistica();
		// TODO: Adicionar gerador com os dados da view
		geradorDeChamada = null;
	}

	private static void loop() {
		// TODO: Implementar pausa etc.
		while (true) {
			avancarTempo();
			executarEvento();
			mostrarEstatisticas();
		}
	}

	private static void avancarTempo() {

	}

	private static void executarEvento() {

	}

	private static void mostrarEstatisticas() {

	}

}
