package Week3day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> number = new ArrayList<Integer>();
      number.add(14);
      number.add(12);
      number.add(13);
      number.add(11);
      number.add(15);
      number.add(14);
      number.add(18);
      number.add(16);
      number.add(17);
      number.add(19);
      number.add(18);
      number.add(17);
      number.add(20);
      
      Set<Integer> N = new HashSet<Integer>();
      for(Integer num : number) {
    	  if(N.add(num)==false)
    	  System.out.println(num);
    	  
      }
	}

}
