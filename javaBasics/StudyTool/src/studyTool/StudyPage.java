package studyTool; 			// indica o pacote no qual a classe está
import java.util.Scanner;   // define a superclasse que será usada

public class StudyPage {

	public static void main(String[] args) {
		Scanner scanterm = new Scanner(System.in);   // cria uma instância que lê input
		String termvar; 						     // declara a variável termvar
		System.out.println("Enter a study term");    // escreve no console o texto entre "
		termvar = scanterm.nextLine();               // atribui input à variável termvar
		Scanner scandef = new Scanner(System.in); 
		String termdef;
		System.out.println("Enter a definition");
		termdef = scandef.nextLine();
		System.out.println(termvar + ": "+ termdef); // concatena "termvar" ":" e "termdef"
		
	} // fim do método main (principal)

} // fim da classe StudyPage	
