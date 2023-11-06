class Prime extends Thread
  {
   static void prime()
    {
      int n=100;
      System.out.println("printing the prime numbers from 1 to 100");
      for(int i=1;i<=n;i++)
        {
          int count =0;
          for(int j=1;j<=i;j++)
            {
              if(i%j==0)
                count++;
            }
          if(count==2)
            System.out.println(i);
        }
    }
   public void run()
    {
      prime();
    }
   
  }
class Even extends Thread
  {
    public void run()
    {
        int n=100;
        System.out.println("printing the even numbers from 1 tom 100");
      for(int i=1;i<=n;i++)
        {
          if(i%2==0)
            System.out.println(i);
        }
    }
  }
class Sample5
  {
    public static void main(String args[])
    {
      Prime p=new Prime();
      p.start();
      try
        {
      p.join();
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
      Even e=new Even();
      e.start();
    }
  }
