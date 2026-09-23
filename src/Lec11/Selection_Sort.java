package Lec11;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,13,-4,5,7};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;//index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		
	}
	
	
}
