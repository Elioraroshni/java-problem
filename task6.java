import java.util.Scanner;  
public class task6  
{  
  public static void main (String[] args)  
  {  
    Scanner sc = new Scanner (System.in); 
    System.out.print("type array size");
    int s=sc.nextInt();
    int []arr = new int [s];
    int i=0;
    for (i=0;i<arr.length;i++)
    {
    int num=sc.nextInt();
    arr[i]=num;
    }
    int midpoint=arr.length/2;
    int flag=0;
     if (arr.length!= 0)
        {
            int j = midpoint + 1;
            for (int k = midpoint - 1; k >= 0; k--)
            {
                if (arr[k] == arr[j])
                    flag = 2;
                midpoint++;
            }
        } else
        {
            int j = midpoint + 1;
            for (int k = midpoint; k >= 0; k--)
            {
                if (arr[k] == arr[j])
                    flag = 2;
                midpoint++;
            }
        }
        if (flag == 2)
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");

    }
  }