package StringLeetcode;

public class IPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1.1.1.1";
		System.out.println(IPAddress(s));
	}

	public static String IPAddress(String s) {
		// TODO Auto-generated method stub
		return s.replace(".", "[.]");
	}

}
