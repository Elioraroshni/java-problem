import java.util.Scanner;
public class task3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
 
   
    for (int i=0;i<arr.length;i++)
    {
    System.out.println("type num");
    int num=sc.nextInt();
    arr[i]=num;
    }
    for (int i=0;i<arr.length-1;i++)
    { 
        for (int j=i+1;j<arr.length;j++)
        {
            if (arr[i]<arr[j])
            {
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
    
   
    }
    for (int k=0;k<arr.length;k++)
    {
        System.out.print(arr[k]+ ",");
    }
    for (int i=0;i<arr.length;i++)
    {
         if (arr[i]%2==0)
         {
         System.out.print(arr[i]+ ",");
         }
         else
         {}
    }
    
}
}