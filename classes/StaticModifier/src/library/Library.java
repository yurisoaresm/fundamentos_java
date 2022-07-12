/**
 * 
 */
package library;

/**
 * @author Yuri Soares
 *	
 *	Esta classe testa e compara variáveis estáticas e de instância.
 */
public class Library {
	public static String staticName;
	public static int myInt;
	private String instanceName;
	
	
	// Construtores
	public Library() {
		staticName = "Construído";
		instanceName = "Construído";
	}
	
	public Library(String s) {
		staticName = "Constructed";
		instanceName = s;
	}
	
	// Métodos get e set estáticos
	public static String getStaticName() {
		return staticName;
	}
	
	public static void setStaticName(String staticName) {
		Library.staticName = staticName;
	}
	
	// Métodos get e set de instância
	public String getInstanceName() {
		return instanceName;
	}
	
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
}
