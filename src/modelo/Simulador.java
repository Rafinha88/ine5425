package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

import visao.ModSimUI;
import visao.TelaDeExecucao;

public class Simulador {

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
	static TelaDeExecucao telaDeExecucao;

	static boolean encerrar;
	static boolean pausado = false;

	private static int numeroDePassosDeExecucao;
	private static CelulaSingletonBuilder instance;
	private static Celula c1;
	private static Celula c2;

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
		telaDeExecucao = new TelaDeExecucao();
		JButton botaoIniciar = visao.getBotaoIniciar();
		botaoIniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visao.setVisible(false);
				visao.preprarVariaveis();

				telaDeExecucao.setVisible(true);
				new Thread(new Runnable() {
					@Override
					public void run() {
						iniciar();
					}
				}).start();

			}
		});
		JButton botaoPausarResumir = telaDeExecucao.getBotaoPausarResumir();
		botaoPausarResumir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (pausado) {
					pausado = false;
				} else {
					pausado = true;
				}
			}
		});

		JComboBox<?> comboBoxPassosDeExecucao = telaDeExecucao.getjComboBox1();
		comboBoxPassosDeExecucao.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				int indice = Integer.valueOf(telaDeExecucao.getjComboBox1()
						.getSelectedIndex());
				switch (indice) {
				case 0:
					numeroDePassosDeExecucao = 1;
					break;
				case 1:
					numeroDePassosDeExecucao = 3;
					break;

				case 2:
					numeroDePassosDeExecucao = 5;
					break;
				}
			}
		});

		JButton botaoEncerrar = telaDeExecucao.getBotaoEncerrar();
		botaoEncerrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				pausado = true;
				encerrar = true;
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
		instance = CelulaSingletonBuilder.getInstance();
		instance.comNomeDoC1("c1");
		instance.comNomeDoC2("c2");
		instance.comNumeroDeCanaisDoC1(canaisC1);
		instance.comNumeroDeCanaisDoC2(canaisC2);
		c1 = instance.constroiOuGetC1();
		c2 = instance.constroiOuGetC2();
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
		while (!encerrar) {
			while (!pausado) {
				if (tempoSimulacao <= relogio.getTempo()) {
					pausado = true;
					encerrar = true;
				}
				int contador = 0;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					break;
				}
				while (contador != numeroDePassosDeExecucao) {
					avancarTempo();
					executarEvento();
					contador++;
				}
				mostrarEstatisticas();
			}
		}
	}

	private static void avancarTempo() {
		relogio.avancarPara(eventos.getFirst().getTempo());
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
		telaDeExecucao.repaint();
		telaDeExecucao.getCampoTempoAtual().setText(
				String.valueOf(relogio.getTempo()));
		telaDeExecucao.getNumeroDeCanaisDeC1Ocupados().setText(
				String.valueOf(estatistica.getNumeroDeCanaisOcupadosDeC1()));
		telaDeExecucao.getNumeroDeCanaisDeC2Ocupados().setText(
				String.valueOf(estatistica.getNumeroDeCanaisOcupadosDeC2()));
		telaDeExecucao.getNumeroChamadasCompletadas().setText(
				String.valueOf(estatistica.getChamadasCompletadas()));
		telaDeExecucao.getNumeroChamadasNoSistema().setText(
				String.valueOf(estatistica.getChamadasNoSistema()));
		telaDeExecucao.getNumeroMaiorTempoChamada().setText(
				String.valueOf(estatistica.getMaiorTempoDeChamada()));
		telaDeExecucao.getNumeroMenorTempoChamada().setText(
				String.valueOf(estatistica.getMenorTempoDeChamada()));
		telaDeExecucao.getNumeroPerdidasC1().setText(
				String.valueOf(estatistica.getChamadaPerdidaFaltaDeCanalC1()));
		telaDeExecucao.getNumeroPerdidasC2().setText(
				String.valueOf(estatistica.getChamadaPerdidaFaltaDeCanalC2()));
		telaDeExecucao.getNumeroPerdidasFA().setText(
				String.valueOf(estatistica.getChamadasSemSinal()));
		telaDeExecucao.getNumeroTempoMedioChamada().setText(
				String.valueOf(estatistica.getTempoMedioDeChamada()));
                telaDeExecucao.getNumeroMaiorChamadasNoSistema().setText(
                                String.valueOf(estatistica.getMaiorNumeroDeChamadasNoSistema()));

	}
}
