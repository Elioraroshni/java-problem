import java.util.Scanner;
  public class task7
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
for (int i=0;i<arr.length;i++)
{
int num=sc.nextInt();
arr[i]=num;
}
System.out.println("type any num between 0-9.");
int store=sc.nextInt();
for (int p=0;p<arr[store];p++)
{
System.out.print("*");
}
}
}