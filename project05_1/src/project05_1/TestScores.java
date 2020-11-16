package project05_1;

import java.util.Scanner;

public class TestScores {

	public static final int MAX_NUMBER_SCORES = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] scores = new double[MAX_NUMBER_SCORES];
		int counting = 0;
		
		System.out.println("This program reads test scores and shows");
		System.out.println("how much each differs from the average.");
		System.out.println("Enter test scores:");
		
		counting = fillArray(scores);
		showDifference(scores, counting);
		
	}

	public static int fillArray(double[] scores)
	{
		Scanner scan = new Scanner(System.in);
		double num;
		int i = 0;
		
		System.out.println("Mark the end of the list with a negative number.");
		num = scan.nextDouble();
		while(num>=0) {
			scores[i] = num;
			i++;
			num = scan.nextDouble();
		}
		
		return i;
	}
	
	public static void showDifference (double[] scores, int num)
	{
		double average = computeAverage(num,scores);
		int i;
		System.out.println("Average of the "+num+" scores = " + average);
		System.out.println("The scores are: ");
		for(i=0; i<num; i++) {
			System.out.println(scores[i]+" differs from average by "+(scores[i]-average));
		}
		/* your code */
	}
	
	public static double computeAverage(int num, double[] scores)
	{	
		int i;
		double sum = 0;
		for(i=0; i< num ; i ++) {
			sum += scores[i];
		}
		return sum/i;
	}
}
