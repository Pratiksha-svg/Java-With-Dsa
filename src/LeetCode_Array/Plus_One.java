package LeetCode_Array;

public class Plus_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr= {9,8,7,6,5,4,3,2,1,0};
		int arr[]= {9};
		arr=Plus_One(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int[] Plus_One(int arr[]) {
		int num=0;
		int mul=1;
		int a=0;
		for(int i=arr.length-1;i>=0;i--) {
			a++;
			num=num+arr[i]*mul;
			mul*=10;
			
		}
		num=num+1;
		//System.out.println(num);
		int temp=num;
		int c=0;
		while(temp>0) {
			c++;
			temp/=10;
		}
		int []sum;
		if(a<c) {
			sum=new int[c];
		}
		else {
			 sum=new int[a];
		}
		
		
		for(int i=c-1;i>=0;i--) {
			int rem =num%10;
			
			sum[i]=rem;
			//System.out.println(sum[i]);
			num/=10;
			
		}
		return sum;
	}

}
