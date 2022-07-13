/**
 * 
 */
package shapes;

/**
 * @author Yuri Soares
 *	
 *	Subclasse da superclasse Shape. 
 */
public class Rectangle extends Shape {
	// Declaração de variáveis exclusivas desta classe
	private int height;
	private int width;
	
	// Construtor
	// Super é palavra-chave para chama a superclasse Shape
	public Rectangle(String color, int height, int width) {
		super.setColor(color);
		this.height = height;
		this.width = width;
	}
	
	// Métodos acessores
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	// Métodos modificadores
	public void setHeight(int length) {
		this.height = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	// Métodos funcionais (outros)
	public int getArea() {
		return width * height;
	}
	
}
