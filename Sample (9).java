import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter data elements into the array");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(" data elements in the array");
      for(int i=0;i<n;i++)
        {
          System.out.print(" "+arr[i]);
        }
      System.out.println("\n enter a element to search");
      int e=sc.nextInt();
       int i;
      for(i=0;i<n;i++)
        {
          if(arr[i]==e)
          {
            System.out.println(e+" is available in "+i+" position");
           break;
          }
          /*else if(i==n-1)
          {
            System.out.println("element not found");
          }*/
        }
      if(i==n)
        System.out.println("element not found");
      
        
    }
  }