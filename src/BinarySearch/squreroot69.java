package BinarySearch;

public class squreroot69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squre(8));
	}
	public static int squre(int n) {
		int lo=1;
		int hi=n-1;
		int max=0;
		int ans=0;
		while(lo<=hi) {
			int mid=(hi+lo)/2;
			if((mid*mid)<=n) {
				ans=mid;
				lo=mid+1;
				
			}
			else {
				hi=mid-1;
			}
			
		}
		
		return ans;
	}

}
