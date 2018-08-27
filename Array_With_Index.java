import java.io.*;
import java.util.*;

  public class Array_With_Index{
    public cstatic void main(String args[]){
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter Array Size:");
      int Array_Size=sc.nextInt();
      int Array_value[]=new int[Array_Size];
        for(int i=0;i<Array_Size;i++)
        {
          Array_value[i]=sc.nexInt();
        }
        for(int i=0;i<Array_Size;i++)
        {
          System.out.println(i+". "+Array_value[i]);
        }
      }  
    }  
