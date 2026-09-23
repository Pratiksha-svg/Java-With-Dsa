package Lec35;

public class Student {
	static int count;
	String name; //class ka datamember/variable
	int age;//class ka datamember/variable
	
	public void Intro_Yourself() {//class ka method ya function
		System.out.println("My name is " +name+ " and age is "+age);
	}
	public void sayHey(String name) {
		//  funny();
		System.out.println(name+" Say hey "+this.name);
	}
	
	public static void funny() {
		//System.out.println(count);
		System.out.println("How funny...");
	}
	static {
		System.out.println("Hey I am Happy To see you");
	}
	
	
	
}
 