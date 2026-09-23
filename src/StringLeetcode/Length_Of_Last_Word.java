
package StringLeetcode;

public class Length_Of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "Hello World";
		 System.out.println(LengthOfLastWord(s));
	}
	
	public static int LengthOfLastWord(String s) {
		//char[] arr = s.toCharArray();
		String ch[]=s.split(" ");
		String p=(ch[ch.length-1]);
		int c=p.length();
//		int count=0;
//		for(int i=0;i<p.length();i++) {
//			count++;
//		}
		
		return c;
		
	}

	

}
