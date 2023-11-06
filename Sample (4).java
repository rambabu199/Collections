import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      Queue<String> q=new LinkedList<String>();
      q.add("a");
      q.add("b");
      q.add("a");
      q.add("c");
      q.add("d");
      q.add("e");
      System.out.println("queue elements: "+q);
      String s=q.remove();
      System.out.println("removed element: "+s);
      String s1=q.poll();
      System.out.println("using poll method: "+s1);
      String s2=q.peek();
      System.out.println("using peek method: "+s2+" \n");
      System.out.println("after queue: "+q);
      
    }
  }