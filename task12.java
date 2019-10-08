import java.util.Scanner;
public class task12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st type two months(1-12) and then type two dates(1-31)");
        System.out.println(before(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        
    }

    public static boolean before(int month1, int day1, int month2, int day2)
    {
        if (month1 < month2)
            return true;
        else if (month1 > month2)
            return false;
        else
        {
            if (day1<day2)
                return true;
            else
                return  false;
        }
    }
}
