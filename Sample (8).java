import java.util.*;
class Binary
  {
    void binarySearch(int arr[],int n)
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("\n enter a element to search  in Binary  search technique");
      int e=sc.nextInt();
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++)
        System.out.print(" "+arr[i]);
      int last=n-1,first=0;
      int mid=(first+last)/2;
      if(e>arr[last]||e<arr[first])
        System.out.println("element not found");
      while(first<=last)
        {
          if(arr[mid]<e)
          {
            first=mid+1;
          }
          else if(arr[mid]==e)
          {
            System.out.println("\n element found at "+mid+" position");
            break;
          }
          else
          {
            last=mid-1;
          }
          mid=(first+last)/2;
        }
    }
  }
class Leanear
  {
    void leanerSearch(int arr[],int n)
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("\n enter a element to search  in leaner search technique");
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
class Sample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Leanear l=new Leanear();
      Binary b=new Binary();
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
       System.out.println("\n 1) lenear search \n 2)binary search \n enter your choice");
      int c=sc.nextInt();
      switch(c)
      {
        case 1:
          l.leanerSearch(arr, n);
          break;
        case 2:          
          b.binarySearch(arr, n);
          break;
        default:
          System.out.println("wrong choice");
        
    }
  }
  }