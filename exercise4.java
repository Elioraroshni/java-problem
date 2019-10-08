import java.util.Scanner; 
public class exercise4 
{ 
  public static void main (String[] args) 
  { 
    Scanner sc = new Scanner (System.in); 
    
   int i=0;
     int j=i+1;
    int []arr =new int[5];
    for ( i=0;i<arr.length;i++)
    {
      int num=sc.nextInt();
    arr[i]=num;
    }
    for (i=0;i<arr.length-1;i++)
    { 
        for ( j=i+1;j<arr.length;j++)
        {
            if (arr[i]>arr[j])
            {
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
    
   
    }
    for (int k=0;k<arr.length;k++)
    {
        System.out.println(arr[k]);
    }
  }
}