
public class shuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codeleet";
		int []indices = {4,5,6,7,0,2,1,3};
		
		
		System.out.println(shuffleString(s,indices));
		
	}

	public static String shuffleString(String s, int[] indices) {
		// TODO Auto-generated method stub
		char []arr=new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			arr[indices[i]]=s.charAt(i);
		}
		
		return new String(arr);
	}
	

}
