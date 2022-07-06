/**
 * 
 */
package bouquet;

/**
 * @author Yuri Soares
 * 
 * Programa para exemplificação do conceito de Arrays em Java.
 *
 */
public class MyBouquetTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 
		 * Declaração de um array:
		 * Ex1: int[] name = new int[SIZE];
		 * Ex2: int name = {v1, v2, v3, ..., vn}; - útil quando já se sabe os dados
		 * */
		String[] myBouquet = {"Rosa", "Girassol", "Margarida", "Dente-de-leão", "Violeta", "Lírio"};
		
		// Buscando dados em um array com loop for
		for (int i = 0; i < myBouquet.length; i++) {
			System.out.println(myBouquet[i]);
		}
		
		// Buscando dados usando loop for-each 
		for (String myFlower : myBouquet) {
			System.out.println(myFlower);
		}
	} // fim do método principal

} // fim da classe MyBouquetTester
