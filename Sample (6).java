import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      TreeSet<String> tset=new TreeSet<String>();
      tset.add("one");
    //  tset.add(null);
      tset.add("two");
      tset.add("three");
      tset.add("four");
      tset.add("five");
      tset.add("six");
     // tset.add(null);
      System.out.println(tset);
      System.out.println("Size of the hash set: "+tset.size());
      System.out.println("contains method: "+tset.contains("six"));
      tset.remove("one");
      System.out.println("after removing: "+tset);
      Iterator itr=tset.iterator();
      System.out.println("\n traversing using iterator");
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      tset.clear();
      System.out.println(tset.isEmpty());
      
    }
  }