package hackerSolutions;

import java.util.Scanner;

public class StringSol1 {
/*
 * here are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
*/
	  public static String newCompare(String str1, String str2){
	        int l1=str1.length();
	        int l2=str2.length();
	        int max=0;
	        if(l1<=l2)
	        {
	            max =l1;
	        }
	        else
	        max=l2;
	       
	        for (int i =0;i<max;i++) {
	            
	            if(str2.charAt(i)>str1.charAt(i))
	            {
	                return "No";
	                	
	            }
	            if(str1.charAt(i)>str2.charAt(i))
	            {
	                return "Yes";
	            }
	        }
	        if(l1==l2)
	        {
	            return "No";
	        }else if (l1 < l2){
	            return "No";
	        }else{
	            return "Yes";
	        }
	  }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	    System.out.println(A.length()+B.length());
	    String result=newCompare(A,B);
	    System.out.println(result);
	    String newStringA= A.substring(0,1).toUpperCase()+A.substring(1, A.length()).toLowerCase();
	    String newStringB= B.substring(0,1).toUpperCase()+B.substring(1, B.length()).toLowerCase();
	    System.out.println(newStringA+" "+newStringB);
	        
	}
}
