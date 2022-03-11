package Week3day2;

import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set <Integer> set1 = new HashSet<Integer>();
       set1.add(3);
       set1.add(2);
       set1.add(11);
       set1.add(4);
       set1.add(6);
       set1.add(7);
       
       Set <Integer> set2 = new HashSet<Integer>();
       set2.add(1);
       set2.add(2);
       set2.add(8);
       set2.add(4);
       set2.add(9);
       set2.add(7);
       
       set1.retainAll(set2);
       System.out.println(set1);
}
}
