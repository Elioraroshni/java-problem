import java.util.Scanner;
public class task5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[15];
        int count[]=new int[10];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Type a number within the range of (0-9)");
            arr[i]=sc.nextInt();
            count[arr[i]]=count[arr[i]]+1;
        }
        for(int p=0; p<10; p++)
        {
            System.out.println(p + " was found " + count[p] + " times");
        }
    }
}