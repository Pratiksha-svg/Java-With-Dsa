package Lec25;
import java.util.*;

public class Key_Pad {
	static String []code= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="23";
		List<String>list=new ArrayList<>();
		Printanswer(ques,"",list);
		System.out.println(list);
		
	}
	public static  void Printanswer(String ques,String ans,List<String>list) {
		if(ques.length()==0) {
			list.add(ans);
			return;
		}
		char ch=ques.charAt(0);  //50
		String press=code[ch-48];
		for(int i=0;i<press.length();i++) {
			Printanswer(ques.substring(1),ans+press.charAt(i),list);
		}
		
	}

}
