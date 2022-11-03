package senai.sp.jandira.S2;

import java.awt.Color;
import java.awt.Font;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			FrameTela tela = new FrameTela();
			tela.titulo = "Calculadora Multiplicandos";
			tela.largura = 950;
			tela.altura = 600;
			tela.fonteDosLabels = new Font("Arial", 50, 12);
			tela.corDaFonteDescricao = new Color(59, 11, 30);
			tela.corDoTitulo = new Color(59, 11, 30);
			tela.corDoBotaoCalcular = new Color(99, 186, 137);
			tela.corDoBotaoLimpar = new Color(158, 30, 81);
			tela.corDaLista = new Color(226, 226, 226);
			tela.corFundoDeTela = new Color(159, 196, 124);
			tela.criarTela();
	}

}
