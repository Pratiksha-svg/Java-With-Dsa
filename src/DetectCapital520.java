
public class DetectCapital520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leeMcode";
		System.out.println(detect(s));
	}

	public static boolean detect(String s) {
		// TODO Auto-generated method stub
		

		
		if(s.equals(s.toUpperCase())) {
			return true;
		}
		
		else if(s.equals(s.toLowerCase())) {
			return true;
		}
		
		

		else {
		
			if(Character.isUpperCase(s.charAt(0))) {
				String a=s.substring(1);
				if(a.equals(a.toLowerCase())) {
					return true;
				}
			}
		}
		
		
		return false;
	}



}
