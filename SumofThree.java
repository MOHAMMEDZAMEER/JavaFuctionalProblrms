import java.util.Scanner;

public class SumofThree {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter n value: ");
		int n = scan.nextInt();
		
		int [] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print(" Please enter the " + (i + 1) + " element: ");
			array[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(" the numbers " + array[i] + ", " + array[j] + ", " + array[k] + " add to 0");
					}
				}
			}
			int i1 = 0;
			int j = 0;
			int k = 0;
			n=array[i1]+array[j]+array[
			                          k];
		System.out.println("Sum is :"+n );
		}
		
		scan.close();
	}

}
