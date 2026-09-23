package leetcodeBitweeklyContext;

public class printans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,1,2,4};
		int color[]= {2,3,2,2};
		System.out.println(print(nums,color));
	}

	private static int print(int[] nums,int color[]) {
		// TODO Auto-generated method stub
		int sum=nums[nums.length-1];;
		int max=0;
		int i=0;
		while(i<color.length-1) {
			if(color[i]==color[i+1]) {
				max=Integer.max(nums[i], nums[i+1]);
				i=i+2;
				sum=sum+max;
			}
			else  if(color[i]!=color[i+1]){
				
				sum=sum+nums[i];
				i++;
			}
			
				
			
			
		}
		return sum;
	}

}
