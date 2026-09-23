package Lec35;

public class Person {
	String name="Anish";
	int age=22;
	
	public void Intro_yourself() {
		System.out.println("My name is "+name+" and age is "+age);
	}
	 
	
	//Constructor
	
	public Person() {
		
	}
	
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	} 
}
 