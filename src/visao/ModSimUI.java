/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

public class ModSimUI extends javax.swing.JFrame {

	/**
	 * Creates new form ModSimUI
	 */
	int frequenciaC1C1;
	int frequenciaC1C2;
	int frequenciaC1FA;

	int frequenciaC2C1;
	int frequenciaC2C2;
	int frequenciaC2FA;

	int canaisC1;
	int canaisC2;

	int mediaFuncaoTempoC1;
	int mediaFuncaoTempoC2;

	String distribuicaoDuracao;
	double parametro1;
	double parametro2;
	double parametro3;

	long tempoSimulacao;
	boolean iniciou;
	boolean pausado;

	public int getFrequenciaC1C1() {
		return frequenciaC1C1;
	}

	public int getFrequenciaC1C2() {
		return frequenciaC1C2;
	}

	public int getFrequenciaC1FA() {
		return frequenciaC1FA;
	}

	public int getFrequenciaC2C1() {
		return frequenciaC2C1;
	}

	public int getFrequenciaC2C2() {
		return frequenciaC2C2;
	}

	public int getFrequenciaC2FA() {
		return frequenciaC2FA;
	}

	public int getCanaisC1() {
		return canaisC1;
	}

	public int getCanaisC2() {
		return canaisC2;
	}

	public int getMediaFuncaoTempoC1() {
		return mediaFuncaoTempoC1;
	}

	public int getMediaFuncaoTempoC2() {
		return mediaFuncaoTempoC2;
	}

	public String getDistribuicaoDuracao() {
		return distribuicaoDuracao;
	}

	public double getParametro1() {
		return parametro1;
	}

	public double getParametro2() {
		return parametro2;
	}

	public double getParametro3() {
		return parametro3;
	}

	public long getTempoSimulacao() {
		return tempoSimulacao;
	}

	public ModSimUI() {
		initComponents();
	}

	public javax.swing.JButton getBotaoIniciar() {
		return botaoIniciar;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLayeredPane1 = new javax.swing.JLayeredPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		tFrequenciaC1C1 = new javax.swing.JTextField();
		tFrequenciaC1C2 = new javax.swing.JTextField();
		tFrequenciaC1FA = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		tFrequenciaC2C1 = new javax.swing.JTextField();
		tFrequenciaC2C2 = new javax.swing.JTextField();
		tFrequenciaC2FA = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		tCanaisC1 = new javax.swing.JTextField();
		tCanaisC2 = new javax.swing.JTextField();
		jPanel4 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		tMediaFuncaoTempoC1 = new javax.swing.JTextField();
		tMediaFuncaoTempoC2 = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		tDistribuicaoDuracao = new javax.swing.JComboBox();
		jLabel17 = new javax.swing.JLabel();
		tParametro1 = new javax.swing.JTextField();
		tParametro2 = new javax.swing.JTextField();
		tParametro3 = new javax.swing.JTextField();
		jPanel5 = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		tTempoSimulacao = new javax.swing.JTextField();
		botaoIniciar = new javax.swing.JButton();

		javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(
				jLayeredPane1);
		jLayeredPane1.setLayout(jLayeredPane1Layout);
		jLayeredPane1Layout.setHorizontalGroup(jLayeredPane1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jLayeredPane1Layout.setVerticalGroup(jLayeredPane1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Frequencia de Chamadas de C1"));

		jLabel1.setText("C1C1");

		jLabel2.setText("C1C2");

		jLabel3.setText("C1FA");

		tFrequenciaC1C1.setText("0");

		tFrequenciaC1C2.setText("0");

		tFrequenciaC1FA.setText("0");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tFrequenciaC1C1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				75,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tFrequenciaC1C2))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tFrequenciaC1FA)))
										.addContainerGap(105, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																tFrequenciaC1C1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																tFrequenciaC1C2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																tFrequenciaC1FA,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(18, Short.MAX_VALUE)));

		jPanel3.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Frequencia de Chamadas de C2"));

		jLabel4.setText("C2C1");

		jLabel5.setText("C2C2");

		jLabel6.setText("C2FA");

		tFrequenciaC2C1.setText("0");

		tFrequenciaC2C2.setText("0");

		tFrequenciaC2FA.setText("0");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tFrequenciaC2C1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				75,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tFrequenciaC2C2))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tFrequenciaC2FA)))
										.addContainerGap(105, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																tFrequenciaC2C1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																tFrequenciaC2C2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																tFrequenciaC2FA,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(18, Short.MAX_VALUE)));

		jPanel2.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Numero de Canais"));

		jLabel7.setText("C1");

		jLabel8.setText("C2");

		tCanaisC1.setText("0");

		tCanaisC2.setText("0");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tCanaisC1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				80,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tCanaisC2)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																tCanaisC1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel8)
														.addComponent(
																tCanaisC2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(16, Short.MAX_VALUE)));

		jPanel4.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Carga do Sistema"));

		jLabel9.setText("Numero de Chamadas que entram no Sistema");

		jLabel10.setText("Tempo entre chegadas (TEC)");

		jLabel11.setText("Funcao Tempo");

		jLabel12.setText("Exponencial");

		jLabel13.setText("C1");

		jLabel14.setText("C2");

		tMediaFuncaoTempoC1.setText("0");

		tMediaFuncaoTempoC2.setText("0");

		jLabel15.setText("Tempo (Duracao) das Chamadas");

		jLabel16.setText("Distribuicao");

		tDistribuicaoDuracao.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Triangular", "Uniforme", "Exponencial",
						"Normal", "Constante" }));
		tDistribuicaoDuracao.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				tDistribuicaoDuracaoItemStateChanged(evt);
			}
		});

		jLabel17.setText("Exponencial");

		tParametro1.setText("0");

		tParametro2.setText("0");

		tParametro3.setText("0");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel9)
																										.addGap(18,
																												229,
																												Short.MAX_VALUE))
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel13)
																														.addComponent(
																																jLabel10)
																														.addComponent(
																																jLabel14))
																										.addGap(18,
																												18,
																												Short.MAX_VALUE)
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addGroup(
																																jPanel4Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel17)
																																		.addGap(18,
																																				18,
																																				18)
																																		.addComponent(
																																				tMediaFuncaoTempoC2))
																														.addComponent(
																																jLabel11)
																														.addGroup(
																																jPanel4Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel12)
																																		.addGap(18,
																																				18,
																																				18)
																																		.addComponent(
																																				tMediaFuncaoTempoC1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				60,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))))
																		.addContainerGap(
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel4Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel16)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												tDistribuicaoDuracao,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								jLabel15,
																								javax.swing.GroupLayout.Alignment.LEADING))
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tParametro1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				60,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tParametro2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				60,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tParametro3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				60,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0,
																				73,
																				Short.MAX_VALUE)))));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel9)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel10)
														.addComponent(jLabel11))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel13)
														.addComponent(
																tMediaFuncaoTempoC1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel12))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel14)
														.addComponent(
																tMediaFuncaoTempoC2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel17))
										.addGap(18, 18, 18)
										.addComponent(jLabel15)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel16)
														.addComponent(
																tDistribuicaoDuracao,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																tParametro1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																tParametro2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																tParametro3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(27, Short.MAX_VALUE)));

		jLabel18.setText("Tempo de Simulação");

		tTempoSimulacao.setText("0");

		botaoIniciar.setText("Iniciar");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel18)
						.addGap(18, 18, 18)
						.addComponent(tTempoSimulacao,
								javax.swing.GroupLayout.PREFERRED_SIZE, 80,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(botaoIniciar)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel18)
														.addComponent(
																tTempoSimulacao,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																botaoIniciar))
										.addContainerGap(80, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(22, 22, 22)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addComponent(jPanel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 134, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel5,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPanel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jPanel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jPanel5,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void tDistribuicaoDuracaoItemStateChanged(
			java.awt.event.ItemEvent evt) {// GEN-FIRST:event_tDistribuicaoDuracaoItemStateChanged
		// TODO add your handling code here:
		distribuicaoDuracao = evt.getItem().toString();
		switch (distribuicaoDuracao) {
		case "Triangular":
			tParametro1.setEnabled(true);
			tParametro2.setEnabled(true);
			tParametro3.setEnabled(true);
			break;
		case "Normal":
			tParametro1.setEnabled(true);
			tParametro2.setEnabled(true);
			tParametro3.setEnabled(false);
			break;
		case "Uniforme":
			tParametro1.setEnabled(true);
			tParametro2.setEnabled(true);
			tParametro3.setEnabled(false);
			break;
		case "Exponencial":
			tParametro1.setEnabled(true);
			tParametro2.setEnabled(false);
			tParametro3.setEnabled(false);
			break;
		case "Constante":
			tParametro1.setEnabled(true);
			tParametro2.setEnabled(false);
			tParametro3.setEnabled(false);
			break;
		}

	}// GEN-LAST:event_tDistribuicaoDuracaoItemStateChanged

	public void preprarVariaveis() {
		this.frequenciaC1C1 = Integer.parseInt(tFrequenciaC1C1.getText());
		this.frequenciaC1C2 = Integer.parseInt(tFrequenciaC1C2.getText());
		this.frequenciaC1FA = Integer.parseInt(tFrequenciaC1FA.getText());
		this.frequenciaC2C1 = Integer.parseInt(tFrequenciaC2C1.getText());
		this.frequenciaC2C2 = Integer.parseInt(tFrequenciaC2C2.getText());
		this.frequenciaC2FA = Integer.parseInt(tFrequenciaC2FA.getText());
		this.canaisC1 = Integer.parseInt(tCanaisC1.getText());
		this.canaisC2 = Integer.parseInt(tCanaisC2.getText());
		this.mediaFuncaoTempoC1 = Integer.parseInt(tMediaFuncaoTempoC1
				.getText());
		this.mediaFuncaoTempoC2 = Integer.parseInt(tMediaFuncaoTempoC2
				.getText());
		this.distribuicaoDuracao = tDistribuicaoDuracao.getSelectedItem()
				.toString();
		this.parametro1 = Double.parseDouble(tParametro1.getText());
		this.parametro2 = Double.parseDouble(tParametro2.getText());
		this.parametro3 = Double.parseDouble(tParametro3.getText());
		this.tempoSimulacao = Integer.parseInt(tTempoSimulacao.getText());

	}

	public boolean verificarTempoDeSimulacao() {
		if (tTempoSimulacao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"O tempo de simulacao deve ser definido", "Erro no Tempo",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}
		return false;
	}

	public void verificarFrequencia() {

		if (frequenciaC1C1 + frequenciaC1C2 + frequenciaC1FA != 100) {
			JOptionPane.showMessageDialog(null,
					"A soma da frequencia deve ser 100%", "Erro na Frequencia",
					JOptionPane.ERROR_MESSAGE);
		}

		if (frequenciaC2C1 + frequenciaC2C2 + frequenciaC2FA != 100) {
			JOptionPane.showMessageDialog(null,
					"A soma da frequencia deve ser 100%", "Erro na Frequencia",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ModSimUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ModSimUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ModSimUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ModSimUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ModSimUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton botaoIniciar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JTextField tCanaisC1;
	private javax.swing.JTextField tCanaisC2;
	private javax.swing.JComboBox tDistribuicaoDuracao;
	private javax.swing.JTextField tFrequenciaC1C1;
	private javax.swing.JTextField tFrequenciaC1C2;
	private javax.swing.JTextField tFrequenciaC1FA;
	private javax.swing.JTextField tFrequenciaC2C1;
	private javax.swing.JTextField tFrequenciaC2C2;
	private javax.swing.JTextField tFrequenciaC2FA;
	private javax.swing.JTextField tMediaFuncaoTempoC1;
	private javax.swing.JTextField tMediaFuncaoTempoC2;
	private javax.swing.JTextField tParametro1;
	private javax.swing.JTextField tParametro2;
	private javax.swing.JTextField tParametro3;
	private javax.swing.JTextField tTempoSimulacao;
	// End of variables declaration//GEN-END:variables
}
