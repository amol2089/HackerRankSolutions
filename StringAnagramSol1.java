package hackerSolutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAnagramSol1 {
	
	static boolean isAnagram(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character,Integer> referenceTable = new HashMap<Character, Integer>();
		//Integer frequency=0;
		char letter1;
		for(int i=0;i<b.length();i++){
			 letter1 = b.charAt(i);
			
			if(!referenceTable.containsKey(letter1)){
				referenceTable.put(letter1, 1);
				
			}
			else{
				Integer frequency = referenceTable.get(letter1);
				referenceTable.put(letter1, ++frequency);
				}
			
		
		}
		char letter;
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int k =0;k<a.length();k++){
			 letter = a.charAt(k);
			
			if(!map.containsKey(letter)){
				map.put(letter, 1);
				
			}
			else{
				Integer frequency = map.get(letter);
				map.put(letter, ++frequency);
				}
		}
		
	/*	System.out.println("=================================");
		
		for (Character key : map.keySet()) {
		    Integer value = map.get(key);
		    System.out.println("Key = " + key + ", Value = " + value);
		}
		System.out.println("=================================");
		for (Character key : referenceTable.keySet()) {
		    Integer value = referenceTable.get(key);
		    System.out.println("Key = " + key + ", Value = " + value);
		}
		System.out.println("=================================");*/
		
		if(map.equals(referenceTable)){
			return true;
		}
		else{
			return false;
		}
		
        
    }
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
