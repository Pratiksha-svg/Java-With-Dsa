package Practice;

public class Reverse_letterAnd_Symbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String s=")ebc#da@f(";
		char arr[]=s.toCharArray();
		System.out.println(arr);
		
		
		
		//swap(arr);
		System.out.println(reverse(arr));
		
		
		System.out.println(arr);
		
	}
	
	public static String reverse(char[]arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(!Character.isLetter(arr[i])) {
				i++;
			}
			else if(!Character.isLetter(arr[j])) {
				j--;
			}
			else {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		sreverse(arr);		
		String ans=new String(arr);
		
		return ans;
	}
	
	
	public static void sreverse(char[]arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(Character.isLetter(arr[i])) {
				i++;
			}
			else if(Character.isLetter(arr[j])) {
				j--;
			}
			else {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
				
		
	}
	
	public static void swap(char []arr,int i,int j) {
		
		
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
	}

	
	

}
