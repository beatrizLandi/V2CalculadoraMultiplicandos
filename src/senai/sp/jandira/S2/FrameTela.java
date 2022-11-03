package senai.sp.jandira.S2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FrameTela {

	//atributos?
	//-------------------------
	public String titulo; 
	public int largura;
	public int altura; 
	public Font fonteDosLabels;
	//cores
	//------------------------------------------
	public Color corDaFonteDescricao;
	public Color corDoTitulo;
	public Color corDoBotaoCalcular;
	public Color corDoBotaoLimpar;
	public Color corDaLista;
	public Color corFundoDeTela;
	Icon IconeTabuada = new ImageIcon("src/br/senai/sp/jandira/imagem/imagem.png");
	
	
	//construtor?
	public void criarTela() {
		JFrame tela = new JFrame(); 
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		// -------------instanciamento--------
		Container painel = tela.getContentPane();
		painel.setBackground(corFundoDeTela);
		
		
		// --------------------------------------------------------------
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("❤٩(｡•́‿•̀｡)۶ CALCULADORA❤");
		labelTabuada.setBounds(50, 40, 300, 30);
		labelTabuada.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 20));
		labelTabuada.setForeground(corDoTitulo);
		
		JLabel labelDescricao = new JLabel();
		
		//o que aparecera no sub titulo
		labelDescricao.setText("<html>Calculadora. <br>Por que calcular a mão esta no passado</html>");
		labelDescricao.setBounds(52, 90, 400, 30);
		labelDescricao.setFont(fonteDosLabels);
		labelDescricao.setForeground(corDaFonteDescricao);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("	(o´▽`o) Multiplicando❤: ");
		labelMultiplicando.setBounds(52, 135, 150, 30);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(240, 135,200, 30);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("	o( ❛ᴗ❛ )o Mínimo Multiplicador❤: ");
		labelMinMultiplicador.setBounds(52, 240, 200, 30);
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(240, 240, 200, 30 );
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("(„• ᴗ •„) Máximo Multiplicador❤: ");
		labelMaxMultiplicador.setBounds(52, 360, 200, 30);
		
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(240, 360, 200, 30);
		//botoezinhos
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("☆Calcular☆");
		buttonCalcular.setBounds(50, 430, 190, 90);
		buttonCalcular.setBackground(corDoBotaoCalcular);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("☆Limpar☆");
		buttonLimpar.setBounds(250, 430, 190, 90);
		buttonLimpar.setBackground(corDoBotaoLimpar);
		
		
		////produtinhos
		JLabel labelResultado = new JLabel();
		labelResultado.setText("♡❤❤Produtos❤❤♡: ");
		labelResultado.setBounds(600, 40, 190, 30);
		
		JList listTabuada = new JList();
		listTabuada.setBackground(corDaLista);
		
		JScrollPane scrollPane = new JScrollPane(listTabuada);
		scrollPane.setBounds(470, 70, 420, 450);	
		
		JLabel labelIcone = new JLabel();
		labelIcone.setBounds(10, 5, 30, 30);
		labelIcone.setSize(80, 80);
		labelIcone.setIcon(IconeTabuada);
		
		
		// componentes S2s2s2
		painel.add(labelTabuada);
		painel.add(labelDescricao);
		painel.add(labelMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMultiplicando);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scrollPane);
		painel.add(labelIcone);
		
		
		//Eventos
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//------------------------------------------------------------------------------
				///mensagens caso  algo de errado 
				if (textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite um multiplicando;(");
					textFieldMultiplicando.requestFocus();
		//------------------------------------------------------------------------------
				} else if (textFieldMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite o mínimo multiplicador;(");
					textFieldMinMultiplicador.requestFocus();
			//------------------------------------------------------------------------------
				} else if (textFieldMaxMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, digite o máximo multiplicador:(S");
			//------------------------------------------------------------------------------
					textFieldMaxMultiplicador.requestFocus();
				} else if (Integer.parseInt(textFieldMaxMultiplicador.getText()) < Integer.parseInt(textFieldMinMultiplicador.getText())) {
					JOptionPane.showMessageDialog(null, "O máximo multiplicador deve ser maior do que o mínimo multiplicador!!!!!");
			//------------------------------------------------------------------------------
					textFieldMaxMultiplicador.requestFocus();
				} else {
					Multiplicacoes m1 = new Multiplicacoes();
					m1.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					m1.minimoMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
					m1.maximoMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
					//------------------------------------------------------------------------------
					
					listTabuada.setListData(m1.getTabuada());
				}
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			textFieldMaxMultiplicador.setText(null);
			textFieldMinMultiplicador.setText(null);
			textFieldMultiplicando.setText(null);
			
			String[] listaVazia = {""};
			listTabuada.setListData(listaVazia);
				
			}
		});	
		
		tela.setVisible(true);
	}
}
