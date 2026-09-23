package leetcodeBitweeklyContext;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word[]= {"abcd","def","xyz"};
		int weight[]= {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
		char[]alpha= {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
		System.out.println(calculate(word,weight,alpha,""));
	}

	public static String calculate(String[] word, int[] weight,char[]alpha,String ans) {
		// TODO Auto-generated method stub
		
		int n=word.length;
		
		for(int i=0;i<n;i++) {
			String s=word[i];
			int sum=0;
			int l=word[i].length();
			for(int j=0;j<l;j++) {
				char ch=s.charAt(j);
				 sum=sum+weight[ch-97];
				
				
			}
			 int k=sum%26;
			 //System.out.println(k);
			 char t=alpha[k];
			 ans=ans+t;
			
			 
			 
			 
		}
		return ans;
	}

}
