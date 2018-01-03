package hackerSolutions;

import java.util.Scanner;

public class StringTokenSol1 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     String s = scan.nextLine();
     
     String[] newString=s.split("[ !,?._'@]+");
     System.out.println(newString.length);
     StringBuffer sb= new StringBuffer();
     for(String bew:newString){
     System.out.println(bew);
     }
     scan.close();
}
}
