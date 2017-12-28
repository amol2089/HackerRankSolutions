package hackerSolutions;

import java.util.Scanner;
/*
 * Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================
 * */
public class StdnSol2 {
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      System.out.println("================================");
      for(int i=0;i<3;i++){
          String s1=sc.next();
          int x=sc.nextInt();
           if(x>=0 && x<1000){
        		  System.out.format("%-15s",s1);
        		  
        		  System.out.format("%03d%n", x);
        		  
              }  
             
      }
      System.out.println("================================");
}
}
