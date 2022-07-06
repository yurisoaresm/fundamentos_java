/**
 * 
 */
package exceptions;

/**
 * @author Yuri Soares
 *
 */
public class Ex1Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] vetor = {1, 2, 3};
		
		// O bloco try/catch trada de erros de exceção: na compilação (não verificada) ou na entrada de dados (verificada)
		try {
			System.out.println(vetor[3]);
		} catch (Exception e) {
			System.out.println("Erro: o índex dado está fora dos limites do vetor.");
		}

	}

}
