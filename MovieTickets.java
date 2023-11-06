import java.util.*;

class Tickets {
  Queue<Integer> ticket = new LinkedList<Integer>();

  void addTicket(int t) {
    ticket.add(t);
  }

  void removeTicket() {
    int n = ticket.poll();
    System.out.println("ticket removed successfully" + n);
  }

  void displayPeek() {
    int n = ticket.peek();
    System.out.println("first ticket in the queue" + n);
  }

  void displaySize() {
    System.out.println("the size of the queue" + ticket.size());
  }

  boolean isEmpty() {
    return ticket.isEmpty();
  }
  void display()
  {
    System.out.println("queue elemnets: \n"+ticket);
  }
}

class MovieTickets {
  public static void main(String args[]) {
    Tickets t1 = new Tickets();
    t1.addTicket(1);
    t1.addTicket(2);
    t1.addTicket(3);
    t1.addTicket(4);
    t1.addTicket(5);
    
    t1.display();
    t1.displaySize();
    t1.displayPeek();
    t1.removeTicket();
    t1.isEmpty();
    t1.removeTicket();
    t1.display();

  }
}