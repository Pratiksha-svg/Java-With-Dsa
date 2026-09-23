package Lec1;

public class Arithmatic_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=9;
		int c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		int d=a*b;
		System.out.println(d);
		d=a/b;
		System.out.println(d);
		d=a%b;
		System.out.println(d);
		
		
		
		double r=(9.18+8.73+7.43+7.95+7.10+7.5+8.5+8.5)/8;
		
		System.out.println(r);

	}

}



//static {
//    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//        try (FileWriter writer = new FileWriter("display_runtime.txt")) {
//            writer.write("0");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }));
//}
