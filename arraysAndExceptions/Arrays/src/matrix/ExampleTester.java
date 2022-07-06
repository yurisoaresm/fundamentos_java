/**
 * 
 */
package matrix;

/**
 * @author Yuri Soares
 *
 */
public class ExampleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matriz = { {1, 2, 3}, {4, 5, 6} }; // matriz com 2 linhas (arrays) e 3 colunas (elementos dos arrays)
		int numArrays; // numArrays = numLinhas
		int numElementos; // numElementos = numColunas em cada Array (linha)
		
		// Acessando número de linhas:
		numArrays = matriz.length;
		
		// Acessando número de 
		numArrays = matriz[0].length; // retorna número colunas da linha 0 (primeira)
		numArrays = matriz[1].length; // retorna número colunas da linha 1 (segunda)
									  // ...
		
	}

}
