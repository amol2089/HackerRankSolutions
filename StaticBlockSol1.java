package hackerSolutions;

import java.util.Scanner;

public class StaticBlockSol1 {
	private static boolean flag;
	private static int H,B;

	static{
		Scanner scan = new Scanner(System.in);
		 H= scan.nextInt();
		 B=scan.nextInt();
		 flag = checkParallelogram(H,B);
		
	}

	public static boolean checkParallelogram(int length,int breadth)  {
		if(length<0 || breadth<0){
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
		else {
			return true;
		}
		return false;
		
		
	}
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
//		int result = checkParallelogram(heigth,breadth);
//		if(result>=0)
//		System.out.println(result);
	}
}
