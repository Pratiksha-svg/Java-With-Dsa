package RecursionPractice;

public class Print {
	public static void main(String[] args) {
		String s="abc";
		System.out.println(Print(s,""));
		
	}

	public static int Print(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.print(ans+" ");
			
			return 1;
			
		}
		
		char ch=s.charAt(0);
		int a=Print(s.substring(1),ans);
		int b=Print(s.substring(1),ans+ch);
		
		return a+b;
	}

	
		
	}
	
	
	


	
		
		
	

	


