import java.util.*;
class Binary
  {
    int arr[];
    Scanner sc=new Scanner(System.in);
    void addElements(int n)
    {
      arr=new int[n];
      System.out.println("enter elements into the array");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
    }
    void binarySort()
    {
       Arrays.sort(arr);
      System.out.println("\n elements after sorting");
      for(int i=0;i<arr.length;i++)
        System.out.print(" "+arr[i]);
      int last=arr.length-1,first=0;
      int near=0;
      int mid=(last+last)/2;
      System.out.println("\n enter a element to search");
      int e=sc.nextInt();
      if(e>arr[last]||e<arr[first])
      {
        if(e>arr[last])
        System.out.println(e+"Nearest Element is"+arr[last]);
       else if(e<arr[first])
         System.out.println(e+"Nearest Element is"+arr[first]);
      }
      else{
      while(first<=last)
        {
          if(arr[mid]<e)
          {
            first=mid+1;
            near=arr[mid];
          }
          else if(arr[mid]==e)
          {
            System.out.println("element found at "+mid+" position ");
            break;
            
          }
          else if(arr[mid]>e)
          {
            last=mid-1;
            near=arr[mid];
          }
          else
          {
            System.out.println("not found");
          }
          mid=(first+last)/2;
        }
        if(near>0)
        System.out.println("near: "+near);
    }
    }
    
  }
class NearestElement
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of the array");
      int n=sc.nextInt();
      Binary b= new Binary();
      b.addElements(n);
      b.binarySort();
    }
  }