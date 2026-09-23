package Lec31;

public class Palindome_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naan";
		System.out.println(CountPalindome( s));
		
	}
	public static int CountPalindome(String s) {
		int count =0;
		
		//odd
		for(int axis =0;axis<s.length();axis++) {
			for(int orbit=0;axis-orbit>=0&& axis+orbit<s.length();orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				count++;
				System.out.println(s.substring(axis-orbit,(axis+ orbit)+1));
			}
		}
		
		
		
	
		
		
		//even
		for(double axis =0.5f;axis<s.length();axis++) {
			for(double orbit=0.5f;axis-orbit>=0&& axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int) (axis+orbit)) ){
					break;
				}
				count++;
				System.out.println(s.substring((int)(axis-orbit),(int)(axis+ orbit)+1));
			}
		}
		return count;
	}

}
