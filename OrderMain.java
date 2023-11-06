import java.util.*;

class Order
  {
    int id;
    String cname;
    String orderName;
  
    Order(int id,String cname,String orderName)
    {
      this.id=id;
      this.cname=cname;
      this.orderName=orderName;
    }
    public int getId()
    {
      return id;
    }
    public String getCname()
    {
      return cname;
    }
    public String getOrderName()
    {
      return orderName;
    } 
     public String toString() {
        return "Order [id=" + id + ", cname=" + cname + ", orderName=" + orderName + "]";
    }
  }
class OrderProcessingSystem
  {
    Queue<Order> ord;
    OrderProcessingSystem()
    {
      ord=new  LinkedList<Order>();
    }
    void placeOrder(Order order)
    {
      ord.add(order);
    }
    void processOrder()
    {
      
      Order a=ord.poll();
      System.out.println("order processed succeccfully"+a);
    }
    void display()
    {
      System.out.println("queue elemnts");
      Iterator itr=ord.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
    }
  }
class OrderMain
{
  public static void main(String args[])
  {
    Order r1=new Order(1,"ram","biryani");
    Order r2=new Order(2,"babu","meals");
    Order r3=new Order(1,"kumar","fry");
    OrderProcessingSystem ops=new OrderProcessingSystem();
    ops.placeOrder(r1);
    ops.placeOrder(r2);
    ops.placeOrder(r3);
    ops.display();
    ops.processOrder();
    ops.processOrder();
    ops.display();
  }
}
