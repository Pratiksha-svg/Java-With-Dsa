package LeetCode_Array;

public class findNumbersEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,345,2,6,7896};
		
		System.out.println(FindNumbersEven(arr));
		
	}
	public static int FindNumbersEven(int arr[]) {
		
		int a=0;
		for(int i=0;i<arr.length;i++) {
			int count =0;
			int num=arr[i];
			
			while(num>0) {
				num=num/10;
				count ++;
			}
			//System.out.println(count);
			
			if(count%2==0) {
				a++;
				
			}
			
			
		}
		return(a);
				
	}

}
