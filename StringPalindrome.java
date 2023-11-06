import java.util.*;
class StringPalindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter astring");
      String str=sc.next();
      char arr[]=str.toCharArray();
      int freq[]=new int[arr.length];
      int visited[]=new int[arr.length];
      for(int i=0;i<visited.length;i++)
          visited[i]=-1;
      if(arr.length%2==0)
      {
        for(int i=0;i<arr.length;i++)
          {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
              {
                if(arr[i]==arr[j]&&visited[j]==-1){
                    count++;
                  visited[j]=0;
                  }  
              }
            if(count>1){
            freq[i]=count;
          }
          else
            freq[i]=0;
        }
        System.out.println("each element frequency");
        for(int i=0;i<freq.length;i++)
          System.out.print(" "+freq[i]);
      int status=0;
      for(int i=0;i<freq.length;i++)
        {
          if(freq[i]%2==0)
            status++;
        }
        if(status==freq.length)
        {
          System.out.println("\nyes");
        }
        else
          System.out.println("\nno");
      }
      else
      {
        for(int i=0;i<arr.length;i++)
          {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
              {
                if(arr[i]==arr[j]&&visited[j]==-1){
                    count++;
                  visited[j]=0;
                  }  
              }
            //if(count>1){
            freq[i]=count;
         // }
          //else
           // freq[i]=0;
        }
         System.out.println("each element frequency");
        for(int i=0;i<freq.length;i++)
          System.out.print(" "+freq[i]);
        int count=0;
        for(int i=0;i<freq.length;i++)
          {
            if(freq[i]%2!=0)
              count++;
          }
        if(count<=1)
        {
          System.out.println(" \n yes");
        }
        else
          System.out.println(" \n no");
      }
    }
  }