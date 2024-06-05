import java.util.Scanner;
public class calulator {

    public static void main(String[] args) {
int n1;
int n2;
int n3;
int cal;
int quotient;
int remainder;
System.out.println(x:"enter 2 number:-");
scanner r=new Scanner(System.in);
System.out.println("enter first number:-");
n1=r.nextInt();
System.out.println("enter second number:-");

n2=r.nextInt();

System.out.println("select operation:-");
System.out.println("1 - add");

System.out.println("2 - subtract");

System.out.println("3 - multiply");

System.out.println("4 - divide");

System.out.println("Enter Operation number");
scanner scanner1=new Scanner(System.in);
n3=s .nextInt();

if (n3 ==1) {
cal=n1+n2
System.out.println(sum of two numbers:- "+cal);
}
else if(n3 ==2){
    cal=n1-n2;
    System.out.println(difference of two numbers:- "+cal);
}
else if(n3 ==3){
    cal=n1*n2;
    System.out.println(product of two numbers:- "+cal);
}
else if(n3 ==4){
    quotient=n1/n2;
    remainder=n1%n2;
    System.out.println(quotient of two numbers:- "+quotient);
    System.out.println(remainder of two numbers:- "+remainder);
    