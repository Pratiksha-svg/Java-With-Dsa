package Practice;

public class equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums[]={-1,2,-3,3};
         System.out.println(findMaxK(nums));
	}
	
	 public static int findMaxK(int[] nums) {
		int  max=-1;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==0){
	                    max= Math.max(max, Math.abs(nums[i]));
	                }
	            }

	        }
	        return max;
	    }

}
