package RecursionPractice;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int ans=1;
		int x=0;
		System.out.println(power(2,x,n,ans));
	}

	public static boolean power(int i, int x, int n,int ans) {
		// TODO Auto-generated method stub
		
		
		if(ans==n) {
			return true;
		}
		if(ans>n) {
			return false;
		}
		return power(2,x+1,n,ans*i);
		
	}

}
