package com.pack;
import java.util.*;

public class buble
{
   public static void main(String[] args)
   {
      int n=0, i, j, x;
      int[] array = new int[100];
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number of elements :  ");
      n=s.nextInt();
      System.out.print("Enter Elements in Random Order: \n");
      for(i=0; i<n; i++)
      {
         array[i] = s.nextInt();
      }
      
      for(i=0; i<(n-1); i++)
      {
         for(j=0; j<(n-i-1); j++)
         {
            if(array[j]<array[j+1])
            {
               x = array[j];
               array[j] = array[j+1];
               array[j+1] = x;
            }
         }
      }
      
      System.out.println("\nThe new sorted array is:");
      for(i=0; i<n; i++)
         System.out.print(array[i]+ " ");
   }
}
