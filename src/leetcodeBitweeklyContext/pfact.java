package leetcodeBitweeklyContext;

public class pfact {
	public static void main(String[] args) {
		int n=415;
		int a=n;
		//int p=a;
		System.out.println(permutation(n,a,""));
	}

	public static boolean permutation(int n, int a,String ans1) {
		
		int sum=0;
		//int an=0;
		while(a>0) {
			
			int p=a%10;
			if(p==0) {
				return false;
				
			}
			a=a/10;
			int ans=1;
			for(int i=p;i>0;i--) {
				ans=ans*i;
//				sum=sum+ans;
				
			}
			sum=sum+ans;
			
			
		}
		
		
		//System.out.println(sum);
		if(sum==n) {
			return true;
		}
		return false;
	}
}
