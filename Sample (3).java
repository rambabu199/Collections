import java.util.*;

class Sample {
  public static void main(String args[]) {
    LinkedList<String> l = new LinkedList<String>();
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    System.out.println("original list " + l);
    l.addFirst("f");
    System.out.println("after adding 1st position element " + l);
    l.addLast("e");
    System.out.println("after adding last position element " + l);
    l.set(1, "g");
    System.out.println("after manipulating 1st position element: " + l);
    System.out.println("getting 3rd position element: " + l.get(3));
    System.out.println("getting first element: " + l.getFirst());
    System.out.println("getting last element: " + l.getLast());
    System.out.println("displaying linked list using foreach loop");
    for (String str : l) {
      System.out.println(str);
    }
    l.remove(2);
    System.out.println("after removing 2nd position element " + l);
    l.removeFirst();
    System.out.println("after removing first position element " + l);
    l.removeLast();
    System.out.println("after removing last position element " + l);
    l.add("k");
    l.add("m");
    l.add("n");
    System.out.println("after adding some more values: "+l);
    System.out.println("displaying linked list using Iterator Interface");
    Iterator itr = l.iterator();
    while (itr.hasNext())
      System.out.println(itr.next());
    System.out.println(" poll method " + l.poll());
    System.out.println("after removing first position element: " + l);
    System.out.println(" pollFirst method: " + l.pollFirst());
    System.out.println(" pollLast method: " + l.pollLast());
    l.clear();
    System.out.println(l);
  }
}