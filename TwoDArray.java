import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
	 int a[][]= new int[2][2];
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter Array Elements :");
		for(int i = 0; i<2; i++) //rows
		{
			for(int j=0;j<2;j++)//colums				
			{
				
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Matrix: \n");
		for(int i=0;i<2;i++) //rows
		{
			for(int j=0;j<2;j++)//colums
				
			{
				
				System.out.println(a[i][j]+" ");
			}
			System.out.println("\n");
			}
	}
	
	}
	
