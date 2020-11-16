package project03_1;
import java.util.Scanner;

public class BranchStmt {

	public static void main(String[] args) {		
		System.out.print("n = ? ");
		int n;
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		if(n<0) System.out.println("n is less than 0");
		else if(n<100) System.out.println("n is greater than or equal to 0 and less than 100");
		else System.out.println("n is greater than or equal to 100");
	}
}
