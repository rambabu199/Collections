import java.util.*;
class TreeMapSample
  {
    public static void main(String args[])
    {
      TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
       tmap.put(105, "deepa");
      tmap.put(103, "kishan");
      tmap.put(101, "rambabu");
      tmap.put(102, "harika");
      
      tmap.put(104, "abul");
     
      for(Map.Entry ent:tmap.entrySet())
        {
          System.out.println("key: "+ent.getKey()+" value: "+ent.getValue());
        }
      System.out.println("total keys"+tmap.keySet());
      System.out.println("size of map: "+tmap.size());
      tmap.remove(101);
      tmap.replace(104, "hussain");
      Set s=tmap.entrySet();
      Iterator itr=s.iterator();
      while(itr.hasNext())
        {
          Map.Entry ent=(Map.Entry)itr.next();
          System.out.print("key is: "+ ent.getKey() + " & Value is: "+ent.getValue()+"\n"); 
        }
      System.out.println("total keys: "+tmap.keySet());
      System.out.println("size of map: "+tmap.size());
      System.out.println("contains 102 key: "+tmap.containsKey(102));
      System.out.println("contains value: "+tmap.containsValue("rambabu"));
      System.out.println("map elements: "+tmap);
      tmap.clear();
      System.out.println("map is empty or not:  "+tmap.isEmpty());
      
      
    }
  }