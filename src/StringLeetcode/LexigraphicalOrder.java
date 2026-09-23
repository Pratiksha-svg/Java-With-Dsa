package StringLeetcode;
import java.util.*;



public class LexigraphicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		List<String>list=new ArrayList<>();
		
		
		for (int i = 0; i <= s.length() - k; i++) {
		    list.add(s.substring(i, i + k));
		}
			
			Collections.sort(list);
			System.out.println(list.get(0));
			System.out.println(list.get(list.size()-1));
		
		
	}

}
