import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      ArrayList <String>l=new ArrayList<String>();
      l.add("Ram");
      l.add("babu");
      l.add("ram");
      System.out.println("plain list "+l);
      l.add(0, "lakshmi");//it will add data at 0th position
      System.out.println("adding 0th position: "+l);
      l.set(1, "rambabu");// it will modify 1st element to rambabu
      System.out.println("modifing: "+l);
      l.remove(0);//it will remove 0th index value
      System.out.println("after removing: "+l);
      l.remove("babu");
      System.out.println("after removing babu: "+l);//it will remove babu from list
      Collections.sort(l);// it will sort the list
      System.out.println("after sorting : "+l);
      String str=l.get(0);// it will print 0th value in list
      System.out.println("getting 0th element : "+str);
      System.out.println("size of the arraylist: "+l.size());// it will print size of the arraylist
      System.out.println(l.contains("lakshmi"));
      // there are two types to display arraylist
      //1st one by using  for each loop
      for(String s:l)
        {
          System.out.println(s);
        }
      //second one is: iterator interface
      Iterator itr=l.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      
      
    }
  }