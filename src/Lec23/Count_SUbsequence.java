package Lec23;

public class Count_SUbsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		
		//PrintSubsquence(ques,"");
		//System.out.println();
		//System.out.println(count);
		System.out.println(PrintSubsquence( ques,""));
	}
		//static int count=0;
	public static int PrintSubsquence(String ques,String ans) {
	
		if(ques.length()==0) {
			System.out.print(ans+" ");
			//count++;
			return 1;
			
		}
		
		char ch=ques.charAt(0);
		int a1=PrintSubsquence(ques.substring(1),ans);
		int b1=PrintSubsquence(ques.substring(1),ans+ch);
		
		return a1+b1;
	}

	

}
