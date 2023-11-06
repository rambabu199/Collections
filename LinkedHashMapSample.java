import java.util.*;
class LinkedHashMapSample
  {
    public static void main(String args[])
    {
      LinkedHashMap<Integer,String> lhmap=new LinkedHashMap<Integer,String>();
       lhmap.put(105, "deepa");
      lhmap.put(101, "rambabu");
      lhmap.put(102, "harika");
      lhmap.put(null, "harika");
      lhmap.put(109, null);      
      lhmap.put(103, "kishan");
      lhmap.put(104, "abul");
     
      for(Map.Entry ent:lhmap.entrySet())
        {
          System.out.println("key: "+ent.getKey()+" value: "+ent.getValue());
        }
      System.out.println("total keys"+lhmap.keySet());
      System.out.println("size of map: "+lhmap.size());
      lhmap.remove(101);
      lhmap.replace(104, "hussain");
      Set s=lhmap.entrySet();
      Iterator itr=s.iterator();
      while(itr.hasNext())
        {
          Map.Entry ent=(Map.Entry)itr.next();
          System.out.print("key is: "+ ent.getKey() + " & Value is: "+ent.getValue()+"\n"); 
        }
      System.out.println("total keys: "+lhmap.keySet());
      System.out.println("size of map: "+lhmap.size());
      System.out.println("contains 102 key: "+lhmap.containsKey(102));
      System.out.println("contains value: "+lhmap.containsValue("rambabu"));
      System.out.println("map elements: "+lhmap);
      lhmap.clear();
      System.out.println("map is empty or not:  "+lhmap.isEmpty());
      
      
    }
  }