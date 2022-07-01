package StringOperations;

public class Comparation {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cde";
		String s3 = "String.";
		String s4 = "This is a "+ s3;
		
		System.out.println(s1.compareTo(s2));
		
		s2 = "ABC";
		
		System.out.println(s1.equals(s2));
		
		s1 = "This is a String.";
		String s5 = new String("This is a String.");
		
		System.out.println("\n-------");
		System.out.println(s1 == s5); // == compara valores de referência (apontando mesmo objeto)
		System.out.println(s1 == s4);

	} // fim do método main

} // fim da classe Comparation
