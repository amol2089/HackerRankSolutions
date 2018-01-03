package hackerSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * The first line contains an integer,  (the initial number of elements in ). 
The second line contains  space-separated integers describing . 
The third line contains an integer,  (the number of queries). 
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
*/
/*
 * Sample input
 * 
5- Arraylist size
12 0 1 78 12-List
2-No Of operations to be performed
Insert-op1
5-position 23-no.
Delete-op2
0-no.


 * Final O/P
 * 0 1 78 12 23
 *  */
public class ArrayListSol1 
{
public static void main(String[] args) 
{
	
	Scanner scan = new Scanner(System.in);
	 String defaultArraySize = scan.nextLine();
	String sampleArray= scan.nextLine();
	List<String> newList = new ArrayList<String>(Arrays.asList(sampleArray.split(" ")));
	List<String> defaultList = new ArrayList<String>();
	defaultList.addAll(newList);
	//System.out.println("Default List: "+defaultList);
	if(newList.size()!=Integer.parseInt(defaultArraySize)){
		System.out.println("Default array List is not equal to list provided");
	}else{
	String noOfOperations = scan.nextLine();
	Integer noOfOperation =Integer.parseInt(noOfOperations);

	while(noOfOperation>0)
	{	
		String operationType= scan.nextLine();
		try {
				if(operationType.equalsIgnoreCase("INSERT"))
				{
					String pos = scan.nextLine();
					List<String> demoPosition = new ArrayList<String>(Arrays.asList(pos.split(" ")));
					Integer index = Integer.parseInt(demoPosition.get(0));
					String element = demoPosition.get(1);
					defaultList.add(index, element);
					noOfOperation=noOfOperation-1;
				}else if(operationType.equalsIgnoreCase("DELETE")){
					String pos = scan.next();
					int index = Integer.parseInt(pos);
					defaultList.remove(index);
					noOfOperation=noOfOperation-1;
				}
		}catch (Exception e) {
				e.printStackTrace();
			}
		}//End of while
		for(String s:defaultList){
		System.out.print(s+" ");
		}
	} 
	
}
}
