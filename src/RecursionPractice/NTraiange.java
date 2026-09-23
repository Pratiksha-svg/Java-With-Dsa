package RecursionPractice;

public class NTraiange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int sum=0;
		TSum(n,sum);

	}

	public  static void TSum(int n, int sum) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(sum);
			return ;
		}
		TSum(n-1,sum+n);
		
	}

}
