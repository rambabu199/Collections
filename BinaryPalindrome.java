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
      int mid=(last+last)/2;
      System.out.println("\n enter a element to search");
      int e=sc.nextInt();
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
            int temp=arr[mid];
            int temp2=arr[mid];
            int rev=0;
            while(temp>0)
              {
                int d=temp%10;
                rev=(rev*10)+d;
                temp=temp/10;
              }
            if(rev==temp2){
            System.out.println("element found at "+mid+" position and it is palindrome number");
            break;
            }
            else
            {
              System.out.println("element found at "+mid+" position but it is not a palindrome number");
            break;
            }
          }
          else
          {
            last=mid-1;
          }
          mid=(first+last)/2;
        }
    }
    
  }
class BinaryPalindrome
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