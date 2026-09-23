package Lec36;

public class Car {

	private String color;
	private int Price;
	private int speed;
	public Car(String color,int price,int speed) {
		this.color=color;
		this.Price=price;
		this.speed=speed;
	}
	
	
//	public void setColor(String color) {
//		this.color=color;
//	}
//	
//	public void setPrice( int Price) {
//		this.Price=Price;
//	}
//	public void setSpeed(int speed) {
//		this.speed=speed;
//	}
//	
//	
//	public String g() {
//		return this.color;
//	}
//	public int getPrice() {
//		return this.Price;
//	}
//	public int getSpeed() {
//		return this.speed;
//	}
//	
	
	
	public void Displaycar() {
		System.out.println("color :"+ color+" price: "+Price+" speed :"+speed);
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrice() {
		return Price;
	}


//	public void setPrice(int price)throws Exception {
//		if(price<0) {
//			throw new Exception("Price cant be -ve");
//		}
//		this.Price = price;
//	}
	
	public void setPrice(int price){
	try {
		
			if(price<0) {
				throw new Exception("Price cant be -ve");
			}
			this.Price = price;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("I am in Finaly");
	}
	}
	


	public int getSpeed() {
		
		return speed;
	}


	public void setSpeed(int speed)  {
		if(speed<0) {
			
			
		}
		this.speed = speed;
	}
}
