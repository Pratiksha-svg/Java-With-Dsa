package Lec35;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hey Guys...");
		Student s=new Student();
		s.name="Pratiksha";
		s.age=21;
		s.Intro_Yourself();
		
		
		
		Student s1=new Student();
		s1.name="Hunir";
		s1.age=25;
		s1.Intro_Yourself();
		
		 
		s1.sayHey("Raja");
		s.sayHey("Raja");
		
		//Satic method
		Student.funny();
		
	}
	
	static {
		System.out.println("Munnaaa....");
	}
	static {
		System.out.println("Riya ....");
	}

}
 