import java.util.Scanner;
public class task10
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("type month");
        int m = sc.nextInt();
        System.out.println("type day");
        int d = sc.nextInt();
        season(m,d);
    }

    public static void season(int month, int day)
    {
        if ((month<=3 || month>=1 || month==12) &&  (day>=1 || day<=31))
        {
          System.out.print("winter");
        }
     
        
        else if ((month>=3 || month<=6) && (day>=1 || day<=31))
        {
        System.out.print("spring");
        }
        
        
     
        
         else if ((month>=6 || month<=9) && (day>=1 || day<=31))
        
        {
        System.out.print("summer");
        }
 
         
            
        
         else if ((month>=9 || month<=12) && (day>=1 || day<=31))
       
        {
        System.out.print("fall");
        }
   
        
           
    }
}
