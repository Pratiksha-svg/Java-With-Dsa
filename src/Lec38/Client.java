package Lec38;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case 1
//		Parent obj=new Parent();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
		
		//case 2
		
		
		//Parent obj=new Child();
		
		//variable
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((Child)(obj)).d2);
//		System.out.println(((Child)(obj)).d);
		
		//method
//		obj.fun();
//		obj.fun1();
//		((Child)(obj)).fun2();  
 
		 
		
		//		case3
//		Child obj=new Parent();  //this is invalid
		
		
		
		//case 4
		
		
		Child obj=new Child();
		System.out.println(((Parent)(obj)).d);
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		
		obj.fun();
		obj.fun1();
		obj.fun2();
		
	}

}
