
public class Binarysumequaltogoal930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,0,1};
		int goal=2;
		//count(arr,goal);
		
		System.out.println(subarraySum(arr,goal));
	}

//	private static void count(int[] arr, int goal) {
//		// TODO Auto-generated method stub
//		int ei=0;
//	}
	
	 public static int subarraySum(int[] nums, int k) {
	        int count=0;
			for(int i=0;i<nums.length;i++) {
				int sum=0;
				for(int j=i;j<nums.length;j++) {
					sum=sum+nums[j];
					if(sum==k) {
						count++;
					}
				}
			}
	        return count;
	    }

}
