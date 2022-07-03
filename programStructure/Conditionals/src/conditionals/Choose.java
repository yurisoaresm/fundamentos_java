/**
 * 
 */
package conditionals;

import java.util.Scanner;
/**
 * @author Yuri Soares
 * 
 * Grave um programa que solicita ao usuário para informar dois números de ponto 
 * flutuante (duplo) e um operador ( *, +, /, %, -). Imprima os resultados de uma operação fornecida.
 * Para ler a linha de comando, use a classe Scanner. Grave o programa primeiro, usando 
 * a lógica switch, em seguida, grave novamente o programa usando a lógica if/else.
 *
 */
public class Choose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaração das variáveis
		Scanner in = new Scanner(System.in);
		double a, b, answer;
		char operator;
		
		System.out.println("Digite um valor real para a: ");
		a = in.nextDouble();
		System.out.println("Digite um valor real para b: ");
		b = in.nextDouble();
		System.out.println("Escolha um perador entre +, -, /, % e *: ");
		operator = in.next().charAt(0); // Obtem um char no índex 0
		in.close();
		
		// Processamento de dados usando Switch
		switch (operator) {
			case '+' : 
				answer = a + b;
				System.out.println(a +" + " + b +" = "+ answer);
				break;
			case '-' : 
				answer = a - b;
				System.out.println(a +" - " + b +" = "+ answer);
				break;
			case '/' :
				answer = a / b;
				System.out.println(a +" / " + b +" = "+ answer);
				break;
			case '%' :
				answer = a % b;
				System.out.println(a +" % " + b +" = "+ answer);
				break;
			case '*' :
				answer = a * b;
				System.out.println(a +" * " + b +" = "+ answer);
				break;
			default: 
				System.out.println("Operador desconhecido. Impossível realizar a operação.");
		}	
		System.out.println("------------------");
		
		// Processamento de dados usando if-else
		if (operator == '+') {
			answer = a + b;
			System.out.println(a +" + " + b +" = "+ answer);
		}
		else if (operator == '-') {
			answer = a - b;
			System.out.println(a +" - " + b +" = "+ answer);
		}
		else if (operator == '/') {
			answer = a / b;
			System.out.println(a +" / " + b +" = "+ answer);
		}
		else if (operator == '%') {
			answer = a % b;
			System.out.println(a +" % " + b +" = "+ answer);
		}
		else if (operator == '*') {
			answer = a * b;
			System.out.println(a +" * " + b +" = "+ answer);
		} else {
			System.out.println("Operador desconhecido. Impossível realizar a operação.");
		}
		
	} // fim do método principal

} // fim da classe Choose
