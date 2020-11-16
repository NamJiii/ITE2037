package project08_2;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int inputNum;
		while(true) {
			try {
				inputNum = keyboard.nextInt();
				if(inputNum == 808)
					break;
				exerciseMethod(inputNum);
			} catch (Exception e){
				System.out.println("Exception is caught in main");
			}
		}
		System.out.println("End of loop");
	}
	
	public static void exerciseMethod(int number) throws Exception {
		try {
			if(number>0) throw new Exception();
			if(number<0) throw new NegativeNumberException();
			else System.out.println("No Exception");
		}catch(NegativeNumberException e){
			System.out.println(e.getMessage());
			System.out.println("Exception is caught in exerciseMethod");
		}finally {
			System.out.println("In finally block");
		}
		System.out.println("After finally block");
	}
	
}
