package RecursionPractice;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		int n=ques.length()-1;
		printanswer(ques,n,"");
	}

	public static void printanswer(String ques, int n, String ans) {
		// TODO Auto-generated method stub
		if(n==-1) {
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(n);
		printanswer(ques,n-1,ans+ch);
	}

}
