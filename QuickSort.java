import java.util.*;

class QuickSort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        } 
       System.out.println(" array elements before sorting");
      for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }     
      int low=0;
      int high=n-1;
      quick(arr,low,high);
      System.out.println(" array elements after sorting");
      for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }     
      
    }
    static void quick(int arr[], int low, int high)
    {
      if(low<high){
      int pidx=partition(arr,low,high);
      quick(arr,low,pidx-1);
      quick(arr,pidx+1,high);
    }
  }
    static int partition(int arr[],int low,int high)
    {
      int i=low-1;
     int  pivot=arr[high];
      for(int j=low;j<high;j++)
        {
          if(arr[j]<pivot)
          { i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           
          }          
        }
      i++;
      int temp=arr[i];
      arr[i]=arr[high];
      arr[high]=temp;
      return i;
    }
  }