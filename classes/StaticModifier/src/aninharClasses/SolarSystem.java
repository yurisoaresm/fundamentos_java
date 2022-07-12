/**
 * 
 */
package aninharClasses;

/**
 * @author Yuri Soares
 *
 */
public class SolarSystem {
	public String nome, local;
	
	public SolarSystem() {
		nome = "Milky Way";
		local = "Unknown";
	}
	
	public SolarSystem(String n, String l) {
		nome = n;
		local = l;
	}
	
	public static class Planet {
		public String nome;
		public int tamanho;
		
		public Planet() {
			
		}
		
		public Planet(String n, int t) {
			nome = n;
			tamanho = t;
		}
		
		public String getNome() {
			return nome;
		}
		
		public int getTamanho() {
			return tamanho;
		}
		
		
	} // fim da classe Planet
	
} // fim da classe SolarSystem
