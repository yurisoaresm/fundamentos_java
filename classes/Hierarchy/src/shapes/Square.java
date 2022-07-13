/**
 * 
 */
package shapes;

/**
 * @author Yuri Soares
 *
 *	Subclasse da superclasse Rectangle que, por sua vez, é subclasse de Shape. Cria uma hierarquia entre classes.
 */
public class Square extends Rectangle  {
	private boolean isFilled; // Variável exclusiva da subclasse
	
	public Square(String color, int size, boolean isFilled) {
		super(color, size, size); // cria Square passando lados iguais ao construtor de Rectangle
		this.isFilled = isFilled;
	}
	
	// Declarando métodos da superclasse
	// Como esta subclasse é um quadrado (Square), ao alterar a largura a altura será igualmente alterada e vice-versa
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	@Override
	public void setHeight(int length) {
		super.setHeight(length);
		super.setWidth(length);
	}
	
	// Método acesor de isFilled  (nota: variáveis bool
	public boolean isFilled() {
		return isFilled;
	}
}
