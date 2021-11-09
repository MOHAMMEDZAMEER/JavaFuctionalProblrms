import java.util.Scanner;
public class  Test{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out .println("Enter a Alphabet : ");
String al= sc.nextLine();

char dl=al.charAt(0);


if (dl == 'a' ||dl == 'A' || dl == 'e' || dl == 'E'|| dl == 'i' || dl == 'I' || dl == 'o' || dl == 'O' || dl == 'u' || dl == 'U' )
{
System.out.println("Entered alphabet is Vowel");
}
else{
System.out.println("Entered alphabet is  a Consonent");
}
}
}
