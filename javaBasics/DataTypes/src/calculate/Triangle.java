package calculate;

import java.util.Scanner;

/* 
 * Escreva um programa que determinará a base e a altura de um triângulo 
 * e calculará e exibirá a área do triângulo usando a fórmula de área de 
 * um triângulo (base * altura / 2).
 * */
public class Triangle {

	public static void main(String[] args) {
		// Inicialização das variáveis e scanners:
		double area, base, altura;
		Scanner scanBase = new Scanner(System.in);
		Scanner scanAltura = new Scanner(System.in);
		
		// Entrada de dados pelo usuário:
		System.out.println("Digite o valor da base do triângulo:");
		base = scanBase.nextDouble();
		System.out.println("Agora, digite o valor da altura:");
		altura = scanAltura.nextDouble();
		
		// Processamento dos dados e saída:
		area = 1/2 * base * altura; // cálculo sem conversão (1 e 2 são inteiros)
		System.out.println("Área = "+ area +"\t(sem conversão)");
		
		area = 1/2.0 * base * altura; // conversão implícita (int para double)
		System.out.println("Área = "+ area +"\t(conversão implícita)");
		
		area = (double) 1/2 * base * altura; //conversão explícita com casting
		System.out.println("Área = "+ area +"\t(com casting)");
	} // fim do método main

} // fim da classe Triangle
