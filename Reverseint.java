import java.io.*;
import java.util.*;
public class Reverseint
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0;
int reverse=0;
while(n>0)
{
rem=n%10;
reverse=(reverse*10)+rem;
n=n/10;
}
System.out.println(reverse);
}
}
