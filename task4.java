import java.util.Scanner;  
public class task4  
{  
  public static void main (String[] args)  
  {  
    Scanner sc = new Scanner (System.in);  
    int []arr=new int [10];
    int flag=1;
    int i=0;
    
    for (i=0;i<arr.length;){ 
      int num = sc.nextInt();
      
      for (int j=0;j<i;j++)
      {
        if (arr[j]==num){
          System.out.println("give another number");
        flag= -1;
  break;   
   }
      }
if (flag==1)
{ 
  arr[i]= num ;
  i++;
}
else 
{
  flag =1;
}
}
}
}