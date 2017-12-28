package hackerSolutions;

import java.util.Scanner;

public class DataTypesSol1 {
	/* Enter your code here. Read input from STDIN.
	 *  Print output to STDOUT. Your class should be named Solution. */
public static void main(String[] args) {
	int lineNumber= 0;
	Scanner scan = new Scanner(System.in);
    while(scan.hasNextLine()){
    	lineNumber++;
    	System.out.printf("%d", lineNumber);
    	System.out.println(" "+scan.nextLine());
    	
    }
//    System.out.printf("%d lines\n", lineNumber);
}
}
