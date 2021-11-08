import java.util.Scanner;

public class Powerof2 {
		public static void main (String[] args){

	int Number;
	int  Power;
	int result=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number :");
	Number = sc.nextInt();
	  System.out.println("Enter the Power :");
        Power = sc.nextInt();
for (int i=1;i<=Power;i++){
result=Number*result;
}
System.out.println("Power == "+result);

		}
	}
