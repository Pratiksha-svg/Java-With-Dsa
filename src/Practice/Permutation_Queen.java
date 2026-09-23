package Practice;

public class Permutation_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean[]arr=new boolean[n];
		int tq=2;
		Permutation(arr,tq,0,"");

	}

	public static void Permutation(boolean[] arr, int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf==tq) {
			System.out.println(ans);
			return ;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==false) {
				arr[i]=true;
				Permutation(arr,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				arr[i]=false;
			}
		}
	
	}

}
