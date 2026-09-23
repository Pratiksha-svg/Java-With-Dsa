package Practice;

public class Cobination_Queen
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean arr[]=new boolean[n];
		int tq=2;
		Combination(arr,tq,0,"",0);
	}

	public static void Combination(boolean[] arr, int tq, int qpsf, String ans, int idx) {
		// TODO Auto-generated method stub
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(arr[i]==false) {
				arr[i]=true;
				Combination(arr,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				arr[i]=false;
			}
		}
	}

}
