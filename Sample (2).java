import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      LinkedHashSet<String> lhset=new LinkedHashSet<String>();
      lhset.add("one");
      lhset.add(null);
      lhset.add("two");
      lhset.add("three");
      lhset.add("four");
      lhset.add("five");
      lhset.add("six");
      lhset.add(null);
      System.out.println(lhset);
      System.out.println("Size of the hash set: "+lhset.size());
      System.out.println("contains method: "+lhset.contains("six"));
      lhset.remove("one");
      System.out.println("after removing: "+lhset);
      Iterator itr=lhset.iterator();
      System.out.println("\n traversing using iterator");
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      lhset.clear();
      System.out.println(lhset.isEmpty());
      
    }
  }