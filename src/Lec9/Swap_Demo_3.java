package Lec9;

public class Swap_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr={10,20,30,40,50};
		 int [] other= {100,200,300,400,600};
		System.out.println(arr[0] + " "+arr[1]); //10 20
		Swap(arr,other);
		System.out.println(arr[0] + " " + arr[1]);
				
		}
	public static void Swap(int[] arr,int[] other) {
		int []temp=arr;
		arr=other;
		other=temp;
	}
	}
	


