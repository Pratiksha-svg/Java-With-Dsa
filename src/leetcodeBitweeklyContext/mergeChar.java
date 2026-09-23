package leetcodeBitweeklyContext;

public class mergeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yybyzybz";
		int k=2;
		print(s,k);
	}

//	private static void print(String s, int k) {
//		// TODO Auto-generated method stub
//		int ei=0;
//		int si=0;
//		String ans="";
//		boolean skip;
//		for(int i=0;i<s.length();i++) {
//			for(int j=i-1;j>=0;j--) {
//				if((i-j)<=k) {
//					if(s.charAt(i)==s.charAt(j)) {
//						skip==true;
//						break;
//					}
//				}
//				else {
//					ans+=s.charAt(i);
//				}
//			}
//		}
//		System.out.println(ans);
//	}

	
	
	 private static void print(String s, int k) {

	        String ans = "";

	        for (int i = 0; i < s.length(); i++) {

	            boolean skip = false;

	            for (int j = i - 1; j >= 0 && (i - j) <= k; j--) {

	                if (s.charAt(i) == s.charAt(j)) {
	                    skip = true;
	                    break;
	                }
	            }

	            if (!skip) {
	                ans += s.charAt(i);
	            }
	        }

	        System.out.println(ans);
	    }
}
