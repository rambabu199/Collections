import java.util.*;
class Contact
  {
    int id;
    String name;
    ArrayList<String> mobilenumber;
    String email;
    String catagery;
    
    Contact(
      int id,
    String name,
    ArrayList<String> mobilenumber,
    String email,
    String catagery)
    {
      this.id=id;
      this.name=name;
      this.mobilenumber=mobilenumber;
      this.email=email;
      this.catagery=catagery;
    }
    public int getId()
    {
      return id;
    }
    public String getName()
    {
      return name;
    }
    public ArrayList<String> getMobile()
    {
      return mobilenumber;
    }
    public String getEmail()
    {
      return email;
    }
    public String getCatagery()
    {
      return catagery;
    }
    public String toString()
    {
      return "id: "+id+" \n name:"+name+"\n mobile number: "+mobilenumber+"\n email: "+email+"\n catagery: "+catagery;
    }
    
  }
class  ContactManagement
  {
      HashMap<Integer,Contact> contacts;
    ContactManagement()
    {
      contacts=new HashMap<Integer,Contact>();
    }
    void addContact(int id,String name,ArrayList<String> mobilenumber,String email,String catagery)
    {
      int ids=id;
      contacts.put(id,new Contact(ids,name,mobilenumber,email,catagery));
    }
    void removeContact(int id)
    {
      if(contacts.containsKey(id))
      {
        contacts.remove(id);
        System.out.println("contact deleted successfully");
      }
      else
        System.out.println("contact not found");
    }
    void updatContact(int id,String name,ArrayList<String> mobilenumber,String email,String catagery)
    {
      if(contacts.containsKey(id))
      {
        contacts.replace(id,new Contact(id,name,mobilenumber,email,catagery) );
         System.out.println("contact updated successfully");
      }
    }
    void displayContactDetails(int id)
    {
      if(contacts.containsKey(id))
      {
        Contact c=contacts.get(id);
         System.out.println("contact ID: "+id);
        System.out.println("contact name: "+c.name);
        System.out.println("contact mobile number: "+c.mobilenumber);
        System.out.println("contact emailId: "+c.email);
        System.out.println("contact catagery: "+c.catagery);
      }
    }
    void displayAll()
    {
      for(int id:contacts.keySet())
        {
          displayContactDetails(id);
        }
    }
   void displayContactCatagery(String catagery)
    {
      
      for(Contact c:contacts.values()){
      if(c.getCatagery().equalsIgnoreCase(catagery))
      {
         System.out.println(c);
  
      }
      }
    }
  void displayNameWise(String name)
    {
      for(Contact c:contacts.values()){
      if(c.getName().equalsIgnoreCase(name))
      {
         System.out.println(c);
  
      }
      }
    }
    
    public static void main(String args[])
    {
      ContactManagement cm=new ContactManagement();
      ArrayList <String>p=new ArrayList<String>();
      p.add("123456789");
      cm.addContact(1, "ram",p, "k.rambabu98@gmail.com", "friends");
      cm.addContact(2, "babu",p, "babu@gmail.com", "family");
      cm.addContact(3, "kishan",p, "kishan@gmail.com", "friends");
     //cm.displayAll();
    //  cm.displayContactDetails(1);
      //cm.displayContactCatagery("friends");
      cm.displayNameWise("ram");
    }
    
  }