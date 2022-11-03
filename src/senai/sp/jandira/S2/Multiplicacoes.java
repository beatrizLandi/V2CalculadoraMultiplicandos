package senai.sp.jandira.S2;

public class Multiplicacoes {

	//atributos
	public int multiplicando;
	public int maximoMultiplicador;
	public int minimoMultiplicador;

	//metodos?
	public String[] getTabuada() {

		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String calculo[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicando * minimoMultiplicador;
			String resultado = multiplicando + 
					" X " + minimoMultiplicador + 
					" = " + produto;
			calculo[contador] = resultado;

			contador++;
			minimoMultiplicador++;

		}

		return calculo;
	}
	
}
