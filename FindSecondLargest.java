package Week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindSecondLargest {

public static void main(String[] args) {
		
	ArrayList<Integer> Num = new ArrayList<Integer>();
		
		Num.add(3);
		Num.add(2);
		Num.add(11);
		Num.add(4);
		Num.add(6);
		Num.add(7);
		
		Collections.sort(Num);
		
		System.out.println("Ascending order : " +Num);
		
		int Num2 = Num.size();
		System.out.println("size of an Num is " + Num2);
		
		System.out.println("2nd element from the last in Num is " + Num.get(Num2-2));
}

}
