package StringLeetcode;

public class leetcode2114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		System.out.println(arr.length);
		System.out.println(countmax(arr));
	}

	public static int countmax(String[] arr) {
			
			int max=0;
		for(int i=0;i<arr.length;i++) {
			String p=arr[i];
			int space=0;
			for(int j=0;j<p.length();j++) {
					if(p.charAt(j)==' '){
						space++;
					}
					
					
				
			}
			max=Integer.max(space, max);
		}
		int word=max+1;
		//System.out.println(word);
		return word;
		
	}
}
