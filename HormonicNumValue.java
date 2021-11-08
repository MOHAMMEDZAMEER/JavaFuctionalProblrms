import java.util.Scanner;

	public class HormonicNumValue{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

        int Number;
	double Sum=0.0;
	System.out.println("Enter the Number");
	Number =sc.nextInt();
		while(Number>0)
{
		Sum+=1.0/Number;
		Number--;
	System.out.println("Sum number is "+Sum);

}
	System.out.println("Nth Hormonic Value Is :"+Sum);
}
}

