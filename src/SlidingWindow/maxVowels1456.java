package SlidingWindow;

public class maxVowels1456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aeiou";
		int k=2;
		
		Max_Vowel(s,k);
	}

	public static int Max_Vowel(String s, int k) {
		// TODO Auto-generated method stub
		int ans=0;
		int count=0;
		for(int i=0;i<k;i++) {
			char ch=s.charAt(i);
			if(isvowel(ch)) {
				count++;
			}
			
		}
		ans=count;
		for(int i=k;i<s.length();i++) {
			if(isvowel(s.charAt(i))) {
				count++;
			}
			if(isvowel(s.charAt(i-k))) {
				count--;
			}
			ans=Math.max(ans, count);
		}
		 
		
		
		return ans;
	}
	public static boolean isvowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		return false;
	}

}
