package Lec18;

public class Print_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12345";
		printSubstring(s);
		
	}
	public static void printSubstring(String s) {
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				System.out.println(s.substring(i,j));
			}
		}
	}

}
