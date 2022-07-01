package StringOperations;

public class StringOperations {

	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = ""; // Vaiza ou nula;
		string3 = "How are you ".concat(string2);
		/* OBS: Modificar uma string não a modifica, mas cria uma nova instância String
		 * em um novo endereço e o endereço atual da  variável muda para o novo.
		 * */
		System.out.println("String3: "+ string3);
		// Obter tamanho da string1
		System.out.println("Length: "+ string1.length());
		// Obter os caracteres da string do índex 0 ao 5 - 1 (4)
		System.out.println("Sub: "+ string3.substring(0,5));
		// Caixa alta
		System.out.println("Upper: "+ string3.toUpperCase());
	} // fim do método main

} // fim da classe StringOperations
