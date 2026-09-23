package Lec19;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer a1=10;
//		Long l1=89l;
//		Long l2=67l;
		
		
//		Float f=18.9f;
//		Double d=6.8;
//		Byte b6=7;
//		Short s=10;
//		
		

		int b=89;
		Integer b1=145;
		b1=b;  //autoboxing
		
		a=a1; //unboxing
		System.out.println(b1);
		
		Integer c1=15;
		Integer c2=15;
		Integer c3=157;
		Integer c4=157;
		System.out.println(c1==c2);
		System.out.println(c3==c4);
		
		

	}

}
