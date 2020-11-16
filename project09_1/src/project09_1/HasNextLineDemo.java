package project09_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HasNextLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new Scanner(new FileInputStream("resource\\BladeRunner.txt"));
			outputStream = new PrintWriter(new FileOutputStream("resource\\NumberedRunner.txt"));
			/* your code */
			/* Input File Location Example: resource\\BladeRunner.txt */
			int n=0;
			while(inputStream.hasNextLine()) {
				n++;
				String sent = inputStream.nextLine();
				outputStream.write(n+" "+sent+"\r\n");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files.");
			System.exit(0);
		}
		
		/* your code */
		inputStream.close();
		outputStream.close();
	}

}
