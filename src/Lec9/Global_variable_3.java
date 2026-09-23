package Lec9;

public class Global_variable_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int x=60;
		System.out.println(val);
		fun(x);
		System.out.println(val);

	}
	static int val=100;
	public static void fun(int x) {
		int a=90;
		System.out.println(x);
		int val=19;
		Global_variable_3.val=120;
		System.out.println(Global_variable_3.val);
	


	}

}
