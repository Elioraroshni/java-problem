import java.util.Scanner; 
public class task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of row");
        int size = sc.nextInt();

        int[][] arr = new int[2][size];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < size; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] arr_c = new int[size];

        for (int j = 0; j < size; j++)
        {
            arr_c[j] = 5 * arr[0][j] - arr[1][j];
        }
        for (int i=0;i<arr_c.length;i++)
        {
          System.out.println(arr_c[i]);
        }
    }
}
