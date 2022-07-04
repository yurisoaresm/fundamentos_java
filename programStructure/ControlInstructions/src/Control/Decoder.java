/**
 * 
 */
package Control;

import java.util.Scanner;
/**
 * @author Yuri Soares
 * 
 * Considere que foi solicitado a você para decodificar uma mensagem secreta. A mensagem codificada está em números e
 * cada número significa uma letra específica. Você descobre informações suficientes do código secreto para decodificar a
 * mensagem atual. Até então, você sabe:
 * 
 *		1 representa 'D'
 *		2 representa 'W'
 *		3 representa 'E'
 *		4 representa 'L'
 *		5 representa 'H'
 *		6 representa 'O'
 *		7 representa 'R'
 *
 * Grava um programa que solicita ao usuário 10 números, um de cada vez e imprime a mensagem codificada. Se
 * o usuário informar um número que não é um daqueles já decifrados, solicite um novo número. Teste seu
 * código com a seguinte entrada: 5 3 4 4 6 2 6 7 4 1
 *
 */
public class Decoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, i = 0;
		String message = "";

		do {
			System.out.println("Digite um número de 1 a 7: ");
			num = in.nextInt();

			switch (num) {
			case 1: 
				message += "D";
				break;
			case 2: 
				message += "W";
				break;
			case 3: 
				message += "E";
				break;
			case 4: 
				message += "L";
				break;
			case 5: 
				message += "H";
				break;
			case 6: 
				message += "O";
				break;
			case 7: 
				message += "R";
				break;
			default:
				System.out.println("Esse número ainda não foi decodificado.");
				continue;
			}
			
			i++;
		} while (i < 10);
		
		System.out.println("A mensagem codificada é: "+ message);
		
	}

}
