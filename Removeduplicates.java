package Week3day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We learn java basics as part of java sessions in java week1";
        String[] wordArray = str.split(" ");
        
        LinkedHashSet<String> words = new LinkedHashSet<String>(Arrays.asList(wordArray));
        {
        
        	 System.out.println(words);
             
             for(String w:words){
                 System.out.println(w);
             }
             
        
        


}
}
}
		

