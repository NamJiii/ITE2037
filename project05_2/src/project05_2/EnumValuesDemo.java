package project05_2;

import java.util.Scanner;

public class EnumValuesDemo {
	enum WorkDay{
		MONDAY,TUESDAY,WENTHDAY,THURSDAY,FRIDAY;
	};
	
	public static void main(String[] args) {
		double total = 0;
		Scanner scan = new Scanner(System.in);
		
		WorkDay[] days = new WorkDay[5];
		days[0] = WorkDay.MONDAY;
		days[1] = WorkDay.TUESDAY;
		days[2] = WorkDay.WENTHDAY;
		days[3] = WorkDay.THURSDAY;
		days[4] = WorkDay.FRIDAY;
		
		for(int i = 0; i <days.length ; i++) {
			System.out.print(days[i]+" worktime : ");
			total += scan.nextDouble();
		}

		System.out.println("Your weekly work time is "+total+" hours.");
	}
}
