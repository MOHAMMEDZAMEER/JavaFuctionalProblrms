import java.util.Scanner;

public class swapTwoNum {

public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a,b,temp;
	System.out.println("Enter first num");
	a=sc.nextInt();
	System.out.println("Enter Second  num");
        b=sc.nextInt();
	 System.out.println("Before Swapping " +a  +" " +b );

	temp=a;
	a=b;
	b=temp;



	System.out.println("After Swapping"+a +" "+b); 
}
}

