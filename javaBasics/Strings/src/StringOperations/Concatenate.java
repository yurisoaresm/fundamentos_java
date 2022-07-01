package StringOperations;

public class Concatenate {

	public static void main(String[] args) {
		String s1 = "This is a ";
		String s2 = "string";
		String s3 = s1 + s2;
		String s4 = "This is a "+ s2;
		s1 += s2;
		System.out.println("s1: "+ s1);
		System.out.println("s2: "+ s2);
		System.out.println("s3: "+ s3);
		System.out.println("s4: "+ s4);
		
		s1 = "\nIsso é um exemplo de escape. \nE agora estamos em uma nova linha. \n \t Isso é uma tabulação.";
		s2 = "\" isso é uma citação entre aspas \"";
		System.out.println(s1);
		System.out.println(s2);
	} // fim do método main

} // fim da classe Concatenate
