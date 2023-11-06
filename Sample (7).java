import java.util.*;
class Sample
  {
    public static void main(String args[])
    {
      Vector<String> v=new Vector<String>(2);
      v.add("apple");
      v.add(0, "element1");
      v.addElement("orange");
      v.addElement("grapes");
      v.addElement("banana");
      System.out.println("size of the vector: "+v.size());
      System.out.println("total capasity of the vector is: "+v.capacity());
      v.addElement("123");
      v.addElement("goa");
      v.addElement("mango");
      System.out.println("size of the vector: "+v.size());
      System.out.println("total capasity of the vector is: "+v.capacity());
      Enumeration e=v.elements();
      System.out.println("elements in vector");
      while(e.hasMoreElements())
        {
          System.out.println(e.nextElement());
        }
      
    }
  }