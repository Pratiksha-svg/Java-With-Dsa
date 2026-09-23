package StringLeetcode;

public class leetcode171ExelSheet {
	public static void main(String[] args) {
		String s="AB";
		System.out.println(exel(s));
	}

	public static int exel(String s) {
		// TODO Auto-generated method stub
		int result=0;
		
		for(int i=0;i<s.length();i++) {
			result=result*26+(s.charAt(i)-'A'+1);
		}
		return result;
	}
}
