

import java.util.Scanner;

public class ComputeQandR {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int dividend,divisior;
		System.out.println("Enter Divided");
		dividend=sc.nextInt();
		System.out.println("Enter divisor");
		divisior=sc.nextInt();
		
		
		int Quotient=dividend/divisior;
		int Remainder=dividend%divisior;
		 
		System.out.println("Quotient is :" +Quotient);
		System.out.println("Reminder is :" +Remainder);
	
	}

}
