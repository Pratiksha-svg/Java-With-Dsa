package SlidingWindow;

public class maxConsOnes1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		System.out.println(ConsecutiveOnes(arr,k));
	}

	public static int ConsecutiveOnes(int[] arr, int k) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int Zcount=0;
		int max=0;
		while(ei<arr.length) {
			if(arr[ei]==0) {
				Zcount++;
			}
			if(Zcount>k) {
				if(arr[si]==0) {
					Zcount--;
					
				}
				si++;
				
			}
			if(Zcount<=k) {
				
				max=Math.max(max, ei-si+1);
				
			}
			
			ei++;
		}
		return max;
		
	}

}
