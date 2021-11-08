import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int Num,temp,i=2;
		System.out.println("Enter the Num :");
		Num=sc.nextInt();
		temp=Num;
		  System.out.println("Facoters are : "+i);
		while(temp>1) {
			if(temp%i==0) {
				temp=temp/i;
				System.out.println("Factor is" +i);
			}
			else {
				i++;
				
			}
	}
	
	
	}

}
