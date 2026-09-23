
public class firstOccurence28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "a";
		String str1="a";
		System.out.println(occurence(str,str1));
		//occurence(str,str1);
	}

	public static int occurence(String str, String str1) {
		// TODO Auto-generated method stub
		for(int i=0;i<=str.length()-str1.length();i++) {
			int j=0;
			while(j<str1.length()) {
				if(str.charAt(i+j)==str1.charAt(j)) {
					j++;
				}
				else {
					break;
				}
				if(j==str1.length()) {
					return i;
				}
			}
			
		}
		return -1;


}
}