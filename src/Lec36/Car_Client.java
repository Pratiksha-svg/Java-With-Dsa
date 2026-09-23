package Lec36;

public class Car_Client {

	public static void main(String[] args)  {
		
		Car c=new Car("Black",1929,25);
		Car c1=new Car("Red",19209,23);
		
		
		
		c.Displaycar();
		c1.Displaycar();
		
		c.setColor("green");
		c.setPrice(-1000);
		c.setSpeed(26);
		
		c.Displaycar();
		  
		
//		System.out.println(c.getColor());
//		System.out.println(c.getPrice());
//		System.out.println(c.getSpeed());
	}
 
}
