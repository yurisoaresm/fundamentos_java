/**
 * 
 */
package academy;

/**
 * @author Yuri Soares
 *
 *	Classe de estudante que armazena seu nome, créditos, pontos de qualidade e a média do aluno.
 *  A média é calculada mediante a divisão dos pontos pelos créditos. A classe possui métodos acessores
 *  , modificadores e de adicionar valores aos créditos e pontos. (OBS: o método modificador atua diretamente
 *  na substituição dos valores das variáveis enquanto os métodos de adicionar vão incrementar ou diminuir o
 *  valor do respectivo campo (variável)).
 */
public class Student {
	private String nome;
	private int creditos;
	private double media;
	private int ptsQualidade;
	
	public Student() {
		nome = "";
		creditos = 0;
		media = 0;
		ptsQualidade = 0;
	}
	
	public Student(String nome, int creditos, int ptsQualidade) {
		this.nome = nome;
		this.creditos = creditos;
		this.ptsQualidade = ptsQualidade;
	}
	
	// Métodos acessores
	public int getCreditos() {
		return creditos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPtsQualidade() {
		return ptsQualidade;
	}
	
	// Métodos modificadores
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPtsQualidade(int ptsQualidade) {
		this.ptsQualidade = ptsQualidade;
	}
	
	// Métodos funcionais (outros métodos)
	public double mediaAtual () {
		return (double) ptsQualidade / creditos;
	}
	
	public void addCreditos (int num) {
		creditos += num;
		System.out.println("Créditos do(a) "+ nome +" foram atualizados.");
	}
	
	public void addPtsQualidade (int num) {
		ptsQualidade += num;
		System.out.println("Pontos de qualidade do(a) "+ nome +" foram atualizados.");
	}
	
	@Override
	public String toString() {
		String s1 = 
				"----------------"
				+ "\nEstudante           : " + getNome()
				+ "\nCréditos            : "+ getCreditos()
				+ "\nPontos de Qualidade : "+ getPtsQualidade()
				+ "\nMédia               : "+ mediaAtual()
				+ "\n";
		
		
		return s1;
	}
	
	
} // fim da classe Student
