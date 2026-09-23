package Lec7;

public class Fun_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a=9;
		int b=7;
		int ans=Add(a,b);//calling
		System.out.println(ans);
		
		
		
	}
	
	public static int Add(int a,int b) {
		int c=a+b;
		System.out.println(sub(c,a));
		return c;
}
	public static int sub(int a,int b) {
		return a-b;
	}

}
