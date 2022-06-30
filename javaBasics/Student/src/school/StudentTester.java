package school;

public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new Student(20221, "Machado de Assis", "111.111.111-00");
		Student s2 = new Student();
		Student s3 = new Student(20223, "Manuel Bandeira", "222.222.222-00");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s3.setName("Manuel Bandeira Atualizado");
		System.out.println(s3);
	}

}
