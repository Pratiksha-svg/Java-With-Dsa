package StringLeetcode;

public class validWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "alice and  bob are playing stone-game10";
        System.out.println(countValidWords(sentence));
	}

	 public static int countValidWords(String sentence) {
	        String[] arr = sentence.trim().split("\\s+");
	        int count = 0;

	        for (String word : arr) {
	            if (isValid(word)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static boolean isValid(String word) {
	        int hyphen = 0;
	        int punctuation = 0;

	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);

	            // digit not allowed
	            if (Character.isDigit(ch)) return false;

	            // hyphen
	            if (ch == '-') {
	                hyphen++;
	                if (hyphen > 1) return false;

	                // must be between letters
	                if (i == 0 || i == word.length() - 1 ||
	                    !Character.isLetter(word.charAt(i - 1)) ||
	                    !Character.isLetter(word.charAt(i + 1))) {
	                    return false;
	                }
	            }

	            // punctuation
	            if (ch == '!' || ch == '.' || ch == ',') {
	                punctuation++;
	                if (punctuation > 1) return false;

	                // must be at end
	                if (i != word.length() - 1) return false;
	            }
	        }

	        return true;
	    }
}
