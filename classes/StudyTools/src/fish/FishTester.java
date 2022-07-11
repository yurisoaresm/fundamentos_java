/**
 * 
 */
package fish;

/**
 * @author Yuri Soares
 *
 */
public class FishTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fish fish1 = new Fish("Amber", "AngelFish", 5);
		Fish fish2 = new Fish("James", "Guppy", 3);
		
		System.out.println(fish1.nicestFish(fish1, fish2).name);
	}
	
	

}
