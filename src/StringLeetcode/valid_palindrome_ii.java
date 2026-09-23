package StringLeetcode;

public class valid_palindrome_ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(Valid_Palindrome( s));
	}
	public static boolean  Valid_Palindrome(String s) {
		int i=0;
		int j=s.length()-1;
		int count=0;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j) && count>1) {
				return false;
			}
			i++;
			j--;
			count ++;
		}
		return true;
	}
	
	
	
}


