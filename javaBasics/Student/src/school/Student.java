package school;

public class Student {
	private int studentId;      // Declaração das variáveis
	private String name;
	private String cpf;
	
	// Construtores
	// Construtor padrão
	public Student() {          
		
	}
	
	// Construtor Sobrecarregado (com parâmetros)
	public Student(int studentId, String name, String cpf) {
		this.studentId = studentId;
		this.name = name;
		this.cpf = cpf;
	}
	
	// Métodos acessores e modificadores:
	// da variável "studentId"
	public int getStudentId() { 
		return studentId;
	}
	
	public void setStudentId(int StudentId) {
		this.studentId = StudentId;
	}
	
	// da variável "cpf"
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// da variável "name"
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { // Método usado para imprimir dados do objeto
		String s1 = "";
		s1 = "INFO ---------"
		+ "\nStudent ID: " + getStudentId()
		+ "\nStudent Name: " + getName()
		+ "\nStudent CPF: " + getCpf();
		return s1;
	}
} // fim da classe Student
