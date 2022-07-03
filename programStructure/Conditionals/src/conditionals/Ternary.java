/**
 * 
 */
package conditionals;

import java.util.Scanner;
/**
 * @author Yuri Soares
 * 
 * Usando um operador ternário, grave uma instrução if/else que retornará verdadeiro ou falso, 
 * se a variável x for menor ou igual a 7.
 */
public class Ternary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um valor inteiro para x: ");
		x = in.nextInt();
		in.close(); // Finaliza o scanner para que o programa não espere outra resposta
		
		System.out.println(x +" é menor ou igual a 7? ");
		System.out.println(x <= 7 ? "True" : "False"); 

	} // fim do método principal

} // fim da classe Ternary
