package RecursionPractice;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123;
				print(0,n);
		
	}
	public static void print(int sum,int n) {
		
		if(n==0) {
			System.out.println(sum);
			return;
		}
		
		print(sum+n%10,n/10);
		
		
	}
}
