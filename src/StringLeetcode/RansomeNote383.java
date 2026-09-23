package StringLeetcode;

public class RansomeNote383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aab";
		String magazine = "baa";
		
		System.out.println(print(ransomNote,magazine));
	}

	public static boolean print(String ransomNote, String magazine) {
	    int[] count = new int[26];

	    // Count characters in magazine
	    for (char c : magazine.toCharArray()) {
	        count[c - 'a']++;
	    }

	    
	    for (char c : ransomNote.toCharArray()) {
	        if (count[c - 'a'] == 0) {
	            return false;
	        }
	        count[c - 'a']--;
	    }

	    return true;
	}

}
