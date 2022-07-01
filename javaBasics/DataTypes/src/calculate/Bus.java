package calculate;

import java.util.Scanner;

public class Bus {
/* 
 * Um ônibus contém 45 pessoas. A escola usará um ônibus somente se puder preenchê-lo completamente. 
 * O restante das pessoas será transportado em vans. Escreva um programa que determinará o número de pessoas 
 * inscritas para ir a uma viagem ao campo. O programa deve imprimir o número de ônibus necessários e 
 * o número total de pessoas que deverão ser transportadas em vans.
 * */
	public static void main(String[] args) {
		Scanner scanPeople = new Scanner(System.in);
		int people, buses, vanSeats;
		
		// Entrada de dados:
		System.out.println("Digite o número de pessoas inscritas na viagem:");
		people = scanPeople.nextInt();
		
		// Processamento dos dados:
		buses = people / 45; // calcula quantidade de ônibus totalmente preenchidos
		vanSeats = people % 45;
		
		System.out.println("Ônibus a serem fretados: "+ buses);
		System.out.println("Pessoas em vans:\t "+ vanSeats);
	}

}
