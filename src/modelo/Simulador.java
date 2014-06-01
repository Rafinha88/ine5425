package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import visao.ModSimUI;
import modelo.Chegada;
import modelo.Estatistica;
import modelo.Evento;
import modelo.Gerador;
import modelo.ListaEncadeadaOrdenada;
import modelo.Relogio;

import org.apache.commons.math3.distribution.NormalDistribution;

public class Simulador {

	// TODO: Adicionar os atributos recebidos pela view de configuraï¿½ï¿½o do
	// operador.

	static Relogio relogio;
	static Gerador gerador;
	static Estatistica estatistica;
	static ListaEncadeadaOrdenada<Evento> eventos;

	static int frequenciaC1C1;
	static int frequenciaC1C2;
	static int frequenciaC1FA;

	static int frequenciaC2C1;
	static int frequenciaC2C2;
	static int frequenciaC2FA;

	static int canaisC1;
	static int canaisC2;

	static int mediaFuncaoTempoC1;
	static int mediaFuncaoTempoC2;

	static String distribuicaoDuracao;
	static double parametro1;
	static double parametro2;
	static double parametro3;

	static long tempoSimulacao;
	static ModSimUI visao;

	static boolean pausado = false;

	private static int numeroDePassosDeExecucao;

	static private void setarVariaveisVisaoParaModelo() {
		frequenciaC1C1 = visao.getFrequenciaC1C1();
		frequenciaC1C2 = visao.getFrequenciaC1C2();
		frequenciaC1FA = visao.getFrequenciaC1FA();

		frequenciaC2C1 = visao.getFrequenciaC2C1();
		frequenciaC2C2 = visao.getFrequenciaC2C2();
		frequenciaC2FA = visao.getFrequenciaC2FA();

		canaisC1 = visao.getCanaisC1();
		canaisC2 = visao.getCanaisC2();

		mediaFuncaoTempoC1 = visao.getMediaFuncaoTempoC1();
		mediaFuncaoTempoC2 = visao.getMediaFuncaoTempoC2();

		distribuicaoDuracao = visao.getDistribuicaoDuracao();
		parametro1 = visao.getParametro1();
		parametro2 = visao.getParametro2();
		parametro3 = visao.getParametro3();

		tempoSimulacao = visao.getTempoSimulacao();

	}

	public static void main(String[] args) {
		visao = new ModSimUI();
		visao.setVisible(true);
		JButton botaoIniciar = visao.getBotaoIniciar();
		botaoIniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visao.preprarVariaveis();
				iniciar();
			}
		});

	}

	private static void iniciar() {
		setarVariaveisVisaoParaModelo();
		setup();
		loop();
		fim();
	}

	private static void fim() {

	}

	private static void setup() {
		eventos = new ListaEncadeadaOrdenada<>();
		relogio = new Relogio();
		estatistica = Estatistica.getInstance();
		gerador = new Gerador(mediaFuncaoTempoC1, frequenciaC1C1,
				frequenciaC1C2, frequenciaC1FA, mediaFuncaoTempoC2,
				frequenciaC2C1, frequenciaC2C2, frequenciaC2FA,
				distribuicaoDuracao, parametro1, parametro2, parametro3);
		numeroDePassosDeExecucao = 1;
		eventos.adicionarOrdenado(gerador.gerarProximaChegadaC1(relogio
				.getTempo()));
		eventos.adicionarOrdenado(gerador.gerarProximaChegadaC2(relogio
				.getTempo()));
	}

	private static void loop() {
		while (!pausado) {
			int contador = 0;
			try {
				Thread.sleep(40l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
			System.out.println("#######################");
			while (contador != numeroDePassosDeExecucao) {
				avancarTempo();
				executarEvento();
				contador++;
			}
			mostrarEstatisticas();
			System.out.println("#######################");
		}
	}

	private static void avancarTempo() {
		System.out.printf("Avançando tempo em %s\n", eventos.getFirst()
				.getTempo());
		relogio.avancarPara(eventos.getFirst().getTempo());
	}

	private static void executarEvento() {
		System.out.printf("Executando evento no tempo %s%n ",
				relogio.getTempo());
		Evento evento = eventos.pop();
		if (evento instanceof Chegada) {
			System.out.println("Evento é uma chegada");
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
		System.out.println("Chamadas completadas : "
				+ estatistica.getChamadasCompletadas());
		System.out.println("Chamadas no sistema : "
				+ estatistica.getChamadasNoSistema());
		System.out.println("Chamadas perdidas por falta do canal 1 : "
				+ estatistica.getChamadaPerdidaFaltaDeCanalC1());
		System.out.println("Chamadas perdidas por falta do canal 2 : "
				+ estatistica.getChamadaPerdidaFaltaDeCanalC2());
		System.out.println("Tempo médio de chamadas: "
				+ estatistica.getTempoMedioDeChamada());
		System.out.println("Tempo total de chamadas: "
				+ estatistica.getTempoTotalDeChamadas());
		System.out.println("Maior tempo de chamada: "
				+ estatistica.getMaiorTempoDeChamada());
		System.out.println("Menor tempo de chamada: "
				+ estatistica.getMenorTempoDeChamada());
	}

}
