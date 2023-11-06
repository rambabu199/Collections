import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      HashSet<String> hset=new HashSet<String>();
      hset.add("one");
      hset.add(null);
      hset.add("two");
      hset.add("three");
      hset.add("four");
      hset.add("five");
      hset.add("six");
      hset.add(null);
      System.out.println(hset);
      System.out.println("Size of the hash set: "+hset.size());
      System.out.println("contains method: "+hset.contains("six"));
      hset.remove("one");
      System.out.println("after removing: "+hset);
      Iterator itr=hset.iterator();
      System.out.println("\n traversing using iterator");
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      hset.clear();
      System.out.println(hset.isEmpty());
      
    }
  }