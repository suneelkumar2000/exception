package array_manipulation;

import java.util.*;

public class ArrayException
{
    private int size,index;
    private int arr[];
    
    public String getDetails(int size)
    {
        
        try
        {
            
            arr = new int[size];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the price details ");
            for(int i= 0; i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
        
            System.out.println("Enter the index of the array element you want to access");
            index = sc.nextInt();
            
            return ("The array element is "+ arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return("Array index is out of range");
        }
        catch(InputMismatchException e)
        {
           return("Input was not in the correct format"); 
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int s = sc.nextInt();
        ArrayException ex = new ArrayException();
        String output=ex.getDetails(s);
        System.out.println(output);
    }
}
