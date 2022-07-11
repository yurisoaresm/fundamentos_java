/**
 * 
 */
package fish;

/**
 * @author Yuri Soares
 *
 */
public class Fish {
	String name;
	String typeOfFish;
	int friendliness;
	
	public Fish() {
		typeOfFish = "Unknown";
		friendliness = 3;
	}
	
	public Fish(String n, String t, int f) {
		name = n;
		typeOfFish = t;
		friendliness = f;
	}
	
	public int getFriendliness() {
		return friendliness;
	}
	
	Fish nicestFish (Fish ... f) {
			Fish temp = f[0];
			for (int i = 0; i < f.length; i++) {
				if (f[i].getFriendliness() > temp.getFriendliness())
					temp = f[i];
				else
					continue;
			}

			return temp;
		}

}
