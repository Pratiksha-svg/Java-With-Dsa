package StringLeetcode;

public class NumberOfSegment434 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "";
	        int count = 0;

	        for(int i = 0; i < s.length(); i++){

	            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')){
	                count++;
	            }
	            
	        }
	        System.out.println(count);

	}

}
