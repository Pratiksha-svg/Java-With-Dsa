package leetcodeBitweeklyContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>bulb=new ArrayList<>(Arrays.asList(10,30,20,10));
		Collections.sort(bulb);
		List<Integer>list=new ArrayList<>();
		 System.out.println(Toggle(bulb,list));
		
	}

	private static List<Integer> Toggle(List<Integer> bulb, List<Integer> list) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<bulb.size();i++) {
			int count=0;
			for(int j=i+1;j<bulb.size();j++) {
				if(bulb.get(i)==bulb.get(j)) {
					i=i+1;
					count++;
				}
				
				
				
			}
			if(count%2==0) {
				int a=bulb.get(i);
				//System.out.println(a);
				
				list.add(a);
			}
			
			
		}
		return list;
		
	}

}
