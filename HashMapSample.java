import java.util.*;
class HashMapSample
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hmap=new HashMap<Integer,String>();
       hmap.put(105, "deepa");
      hmap.put(101, "rambabu");
      hmap.put(102, "harika");
      hmap.put(103, "kishan");
      hmap.put(104, "abul");
      hmap.put(null, "harika");
      hmap.put(null, null);   
     
      for(Map.Entry ent:hmap.entrySet())
        {
          System.out.println("key: "+ent.getKey()+" value: "+ent.getValue());
        }
      System.out.println("total keys"+hmap.keySet());
      System.out.println("size of map: "+hmap.size());
      hmap.remove(101);
      hmap.replace(104, "hussain");
      Set s=hmap.entrySet();
      Iterator itr=s.iterator();
      while(itr.hasNext())
        {
          Map.Entry ent=(Map.Entry)itr.next();
          System.out.print("key is: "+ ent.getKey() + " & Value is: "+ent.getValue()+"\n"); 
        }
      System.out.println("total keys: "+hmap.keySet());
      System.out.println("size of map: "+hmap.size());
      System.out.println("contains 102 key: "+hmap.containsKey(102));
      System.out.println("contains value: "+hmap.containsValue("rambabu"));
      System.out.println("map elements: "+hmap);
      hmap.clear();
      System.out.println("map is empty or not:  "+hmap.isEmpty());
      
      
    }
  }