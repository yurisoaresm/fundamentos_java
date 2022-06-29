package convertToGallons;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// Conversão de galões americanos em litros, sabendo que: 1 galão = 3.78541178 L
		Scanner scangallons = new Scanner(System.in);
		int numgallons; 
		System.out.println("Enter number of gallons:");
		numgallons = scangallons.nextInt();
		double converttoliters = numgallons * 3.78541178;
		System.out.println(numgallons +" gallons = "+ converttoliters +" L");

	} // fim do método principal

} // fim da classe Convert
