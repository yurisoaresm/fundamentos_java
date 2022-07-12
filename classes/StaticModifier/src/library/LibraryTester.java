/**
 * 
 */
package library;

/**
 * @author Yuri Soares
 *
 */
public class LibraryTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library l1 = new Library();
		Library l2 = new Library("ConstructedInstância");
		
		System.out.println(Library.getStaticName()); 
		System.out.println(Library.staticName +" e "+ l1.getInstanceName()); 
		Library.setStaticName("Modificado");
		System.out.println(Library.getStaticName() +" e "+ l1.getInstanceName()); 
		Library.staticName = "Remodificado";
		System.out.println(Library.staticName +" e "+ l1.getInstanceName()); 
		
		System.out.println("l2: "+ l2.getInstanceName() +" "+ l2.getStaticName());
		System.out.println("l1: "+ l1.getInstanceName() +" "+ l1.getStaticName());
		
		// Ao instanciar um objeto com argumentos, a variável estática tem seu valor alterado 
		// (e funciona para todas os objetos daquela classe)
		Library l3 = new Library("ConstructedInstância");
		
		System.out.println("l2: "+ l2.getInstanceName() +" "+ l2.getStaticName());
		System.out.println("l1: "+ l1.getInstanceName() +" "+ l1.getStaticName());
		System.out.println("l3: "+ l3.getInstanceName() +" "+ l3.getStaticName());
	}

}
