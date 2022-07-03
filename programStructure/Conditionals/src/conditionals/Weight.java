/**
 * 
 */
package conditionals;

import java.util.Scanner;
/**
 * @author Yuri Soares
 * 
 * Grave um programa Java para determinar seu peso em outro planeta. O programa deve perguntar o peso do usuário na
 * Terra, em seguida, apresentará um menu de outros planetas em nosso sistema solar. O usuário deve escolher um dos
 * planetas do menu. TO programa deve exibir a frase como segue: “Seu peso em Marte é 25 kg." Use os seguintes fatores de
 * conversão (multiplique seu peso da Terra por este número, para determinar seu peso neste planeta):
 * 
 *	Mercúrio  : 0.38
 *	Vênus     : 0.91
 *	Marte     : 0.38
 *	Júpiter   : 2.36
 *	Saturno   : 0.92
 *	Urano     : 0.89
 *  Neturno   : 1.13
 *  
 */
public class Weight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaração das variáveis
		Scanner in = new Scanner(System.in);
		double pesoTerra;
		int opcao;
		
		// Entrada dos dados
		System.out.println("Informe seu peso (em kg): ");
		pesoTerra = in.nextDouble();
		
		System.out.println("=== MENU ===");
		System.out.println("Escolha uma das opções abaixo para calcular seu peso no respectivo planeta: ");
		System.out.println("1. Mercúrio \n"
				+ "2. Vênus \n"
				+ "3. Marte \n"
				+ "4. Júpiter \n"
				+ "5. Saturno \n"
				+ "6. Urano \n"
				+ "7. Neturno");
		opcao = in.nextInt();
		in.close();
		
		// Processamento e saída dos dados
		switch (opcao) {
		case 1 : 
			System.out.println("Seu peso em Mercúrio é "+ pesoTerra * 0.38 +" kg.");
			break;
		case 2 : 
			System.out.println("Seu peso em Vênus é "+ pesoTerra * 0.91 +" kg.");
			break;
		case 3 :
			System.out.println("Seu peso em Marte é "+ pesoTerra * 0.38 +" kg.");
			break;
		case 4 :
			System.out.println("Seu peso em Júpiter é "+ pesoTerra * 2.36 +" kg.");
			break;
		case 5 :
			System.out.println("Seu peso em Saturno é "+ pesoTerra * 0.92 +" kg.");
			break;
		case 6 :
			System.out.println("Seu peso em Urano é "+ pesoTerra * 0.89 +" kg.");
			break;
		case 7 :
			System.out.println("Seu peso em Neturno é "+ pesoTerra * 1.13 +" kg.");
			break;
		default: 
			System.out.println("Escolha inválida. Execute novamente o programa e escolha uma das opções do menu.");
	}	
		
	} // fim do método principal

} // fim da classe Weight
