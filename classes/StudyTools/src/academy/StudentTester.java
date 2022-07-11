/**
 * 
 */
package academy;

/**
 * @author Yuri Soares
 * Classe principal (Driver) da classe Student. Executa o programa.
 */
public class StudentTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = new Student("Mary Jones", 14, 46);
		Student st2 = new Student("John Stiner", 60, 173);
		Student st3 = new Student("Ari Samala", 31, 69);

		System.out.println(st1.toString());
		st1.addCreditos(-5);
		st1.addPtsQualidade(20);
		System.out.println(st1.toString());
		
		st2.addCreditos(13);
		st2.addPtsQualidade(52);
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	}

}
