package ArrayDoubt;

public class ConcatinationOfArrays {
	public static void main(String[] args) {
		int []arr1= {2,3,4,6};
		int []arr2= {8,3,5,3,4,7,6};
		int n=arr1.length+arr2.length;
		int []arr=new int [n];
		
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr[index]=arr1[i] );
			System.out.print(" ");
			index++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr[index]=arr2[i] );
			System.out.print(" ");
			index++;
		}
	}
}
