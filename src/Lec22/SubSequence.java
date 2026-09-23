package Lec22;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		
		PrintSubsquence(ques,"");

	}
	public static void PrintSubsquence(String ques,String ans) {
	
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
			
		}
		
		char ch=ques.charAt(0);
		PrintSubsquence(ques.substring(1),ans);
		PrintSubsquence(ques.substring(1),ans+ch);
		
	}

}
