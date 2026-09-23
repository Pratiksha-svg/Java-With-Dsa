package SlidingWindow;

public class maxConscecutive1S485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,1,0,1,0,1,0,0,1,1,1,1,1,1,0};
		System.out.println(count(arr));
		
		}

	public static int count(int[] arr) {
		// TODO Auto-generated method stub
		
		int ei=0;
		int si=0;
		int max=0;
		while(ei<arr.length) {
			if(arr[ei]==0) {
				si=ei+1;
				
			}
			max=Math.max(max, ei-si+1);
			ei++;
			
		}
		return max;
	}
	
	

}
