/**
 * 
 */
package Control;

import java.util.Scanner;
/**
 * @author Yuri Soares
 *
 *	Esse programa verifica se uma palavra de entrada é um palíndromo (palavra idêntica
 *	quando lida de trás pra frente). Ele deve calcular o tamanho da palavra, comparar
 *	a primeira com a última letra e todas as letras até o meio ser alcançado.
 *
 */
public class PalindromeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String word = in.next();
		int firstPosition = 0;
		int lastPosition = word.length() - 1;
		boolean isAPalindrome = true;
		
		while (firstPosition < lastPosition) {
			if (word.charAt(firstPosition) != word.charAt(lastPosition))
				isAPalindrome = false;
			firstPosition++;
			lastPosition--;
		} // fim do while
		
		if (isAPalindrome) 
			System.out.println("A palavra é um palíndromo.");
		else 
			System.out.println("A palavra não é um palíndromo.");
	} // fim do método principal

} // fim da classe PalindromeTester
