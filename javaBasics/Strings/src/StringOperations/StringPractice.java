package StringOperations;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		String s1 = new String("abc"); // Instanciando usando new
		String s2 = "abc"; 			   // Instanciando usando literal
		String name, name2; // Cria uma referência a um objeto string (ponteiro)
		name = "Mya";
		name2 = name; // name2 passa a apontar para o endereço de name, ou seja, Mya
		System.out.println("Haverá um único objeto de String chamado Mya.");
		System.out.println("name = "+ name +"\nname2 = "+ name2);
		/* 
		 * Note que caso se declare: name = "Mya" e name2 = "Mya", criar-se-á duas
		 * instâncias de strings; o compilador JVM poupará espaço automanticamente e
		 * criará apenas um objeto "Mya" na memória, onde name e name2 estarão referenciando.
		 * 
		 * Isso não acontecerá caso se use um scanner para ler os dados do usuário.
		 * Se o usuário digitar a mesma string para name e name2, o JVM criará DOIS
		 * objetos de string na memória. 
		 * */
		System.out.println("-----------------------------");
		Scanner in = new Scanner(System.in);
		name = in.next();
		name2 = in.next();
		
		System.out.println("Dois objetos de String serão criados na memória: um para name e outro para name2.");
		System.out.println("name = "+ name +"\nname2 = "+ name2);
		
	} // fim do método main

} // fim da classe StringPractice
