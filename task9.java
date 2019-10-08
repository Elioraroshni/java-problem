import java.util.Scanner; 
public class task9
{
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        arr=square(arr,arr.length);
        display(arr);
    }

    public static void display(int[] arr)
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] square(int[] arr, int arrSize)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }
}
