package RecursionPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abbkk";
		
		System.out.println(IsPalindrome(ques,0,ques.length()-1));
	}

	public static boolean IsPalindrome(String ques, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {
			return true;
		}
		
		if(ques.charAt(i)!=ques.charAt(j)) {
			return false;
		}
		if(i>=j) {
			return true;
		}
		return IsPalindrome(ques,  i+1, j-1);
		
		
	}
	

}
