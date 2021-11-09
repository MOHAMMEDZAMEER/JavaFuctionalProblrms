import java.util.Scanner;

public class LargestThreeNum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter First num");
a=sc.nextInt();
System.out.println("Enter second num");
b=sc.nextInt();
System.out.println("Enter Third num");
c=sc.nextInt();
if(a>b){
if (a>c)
{
System.out.println("greatest Num is " +a);
}
else{
System.out.println("greatest Num is " +c);
}
}
else if(b>a){
if (b>c)
{
System.out.println("greatest Num is " +b);
}
else{
System.out.println("greatest Num is " +c);
}
}
}
}
