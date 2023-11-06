import java.util.*;
class Sorting
{
  void read(int arr[],int n)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
  }
  void display(int arr[],int n)
  {
     for(int i=0;i<n;i++)
       System.out.print(" "+arr[i]);
  }
  void bubble(int arr[],int n)
  {
    for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
         {
            if(arr[i]>arr[j])
            {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
         }
      }
  }
}
class SelectionSort
  {
    public static void main(String args[])
    {
      Sorting s=new Sorting();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of the array");
      int n=sc.nextInt();
      int arr[]=new int[n];
      s.read(arr,n);
      System.out.println(" array elements before sorting");
      s.display(arr,n);
      s.bubble(arr,n);
      System.out.println("\n array elements after performing sorting");
      s.display(arr,n);
    }
  }







