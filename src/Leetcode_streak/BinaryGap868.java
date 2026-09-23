package Leetcode_streak;

public class BinaryGap868 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		System.out.println(gap(n));
	}

	public static int gap(int n) {
		// TODO Auto-generated method stub
		String binary=Integer.toBinaryString(n);
		int curr=0;
		int prev=0;
		int max=0;
		while(curr<binary.length()) {
			if(binary.charAt(curr)=='1') {
				max=Integer.max(max, curr-prev);
				prev=curr;
			}
			curr++;
		}
		return max;
	}
	

}
