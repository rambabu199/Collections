import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      Stack <String>s=new Stack<String>();
      s.push("Akthar");
      s.push("ram");
      s.push("bhim");
      s.push("raju");
      s.push("akthar");
      s.pop();
      Iterator itr=s.iterator();
      
      while(itr.hasNext())
        System.out.println(itr.next());
    }
  }