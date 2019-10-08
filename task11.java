import java.util.Scanner;
public class task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("type any num");
        int num = sc.nextInt();
        System.out.println(allDigitsOdd(num));
    }

    public static boolean allDigitsOdd(int num1)
    {
        int count = 0;
        int c_odd=0;
        while (num1 > 0)
        {
            int p=num1%10;
            num1 = num1 / 10;
            count++;
            if(p%2!=0)
                c_odd++;
        }
        if (c_odd==count)
            return true;
        else
            return false;
    }
}
