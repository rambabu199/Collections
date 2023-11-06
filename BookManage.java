import java.util.*;
class Book
  {
    int copies;
    String title,author;
    Book(String title,String author,int copies)
    {
      
      this.title=title;
      this.author=author;
      this.copies=copies;
    }
  }
class BookManage
  {
    HashMap<Integer,Book> bookcatalog;
    BookManage()
    {
      bookcatalog=new HashMap<Integer,Book>();
    }
    void addBook(int id,String title,String author,int copi.
    void barrowBook(int id)
    {
      if(bookcatalog.containsKey(id))
      {
        Book book=bookcatalog.get(id);
        if(book.copies>0)
        {
          book.copies--;
          System.out.println(book.title+" Book is borrewded successfully");
        }
        else
          System.out.println("copies not avilable");
      }
      else 
        System.out.println("Book not found");
    }
    void returnBook(int id)
    {
       if(bookcatalog.containsKey(id))
      {
        Book book=bookcatalog.get(id);
        book.copies++;
        System.out.println(book.title+" Book is returned successfully");
      }
    }
    void display()
    {
      for(int id:bookcatalog.keySet())
        {
          displayBookdetails(id);
        }
    }
    void displayBookdetails(int id)
    {
      if(bookcatalog.containsKey(id))
      {
        Book book=bookcatalog.get(id);
        System.out.println("Book ID: "+id);
        System.out.println("Book Title: "+book.title);
        System.out.println("Book Author: "+book.author);
        System.out.println("Book avilable copies: "+book.copies);        
      }
      else
        System.out.println("Book not found");
    }
    public static void main(String args[])
    {
      BookManage b=new BookManage();
      b.addBook(1, " core java","R.Nageswara rao", 10);
      b.addBook(2, " Advanced java","MR.Rao", 10);
      b.addBook(3, " python","rambabu", 15);
      b.addBook(4, " html","kishan", 10);
      b.display();
      b.barrowBook(1);
      b.barrowBook(3);
      b.barrowBook(2);
      b.displayBookdetails(2);
      b.display();
      b.returnBook(1);
      b.display();
    }
  }