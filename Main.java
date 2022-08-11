public class Main{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("Kamal");
		s1.setDit("IT2233");
		s1.setAddress("Colombo");
		
		Student s2 = new Student();
		s2.setName("Nimal");
		s2.setDit("IT4455");
		s2.setAddress("Negambo");
		
		Student s3 = new Student();
		s3.setName("Sunil");
		s3.setDit("IT8899");
		s3.setAddress("Badulla");

		s1.getDetails();
    s2.getDetails();
		//System.out.println(s1.getDetails());
		//System.out.println(s3.getDetails());
		
		
	}

}
