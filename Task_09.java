

import java.util.Scanner;


public class Task_09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        array=square(array,array.length);
        display(array);
    }

    public static void display(int[] array)
    {
        for (int i : array)
        {
            System.out.println(i);
        }
    }

    public static int[] square(int[] array, int arraySize)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array[i]*array[i];
        }
        return array;
    }
}
