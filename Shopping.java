
/*Scenario: Online Shopping Cart

Imagine you're building an online shopping application in Java. One of the requirements is to implement a shopping cart using an ArrayList to manage the items that users add to their cart. Each item in the cart has a name, price, and quantity.

Question:

You're tasked with implementing the shopping cart functionality using an ArrayList. Define a class named CartItem to represent an item that can be added to the cart. The class should have the following attributes:

itemName: a string representing the name of the item.
itemPrice: a double representing the price of the item.
quantity: an integer representing the quantity of the item in the cart.

Implement a class named ShoppingCart that manages the items using an ArrayList of CartItem objects. This class should have the following methods:

void addItem(CartItem item): Adds the given CartItem to the shopping cart. If an item with the same name already exists in the cart, update the quantity accordingly.
void removeItem(String itemName): Removes the CartItem with the given name from the cart. If the item doesn't exist in the cart, print an error message.
double calculateTotalPrice(): Calculates and returns the total price of all items in the cart.
void displayCart(): Displays the contents of the cart, showing each item's name, price, and quantity.

Implement a simple program that demonstrates the usage of the ShoppingCart class. Create a few CartItem objects, add them to the cart, remove some items, and then display the final cart contents along with the total price.
*/
import java.util.*;

class CartItem {
  String itemname;
  double price;
  int quantity;

  CartItem(String itemname, double price, int quantity) {
    this.itemname = itemname;
    this.price = price;
    this.quantity = quantity;
  }

  public String getItemName() {
    return itemname;
  }

  public double getItemPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}

class ShoppingCart {
  ArrayList<CartItem> cart;

  public ShoppingCart() {
    cart = new ArrayList<>();
  }

  void addItem(CartItem item) {
    cart.add(item);
  }

  void removeItem(String itemName) {
    Iterator<CartItem> iterator = cart.iterator();
    while (iterator.hasNext()) {
      CartItem c = iterator.next();
      if (c.getItemName() == itemName) {
        iterator.remove();
        System.out.println("item is " + itemName + " removed successfully");
        return;
      }
    }
    System.out.println("Error:  " + itemName + " not found.");
  }

  double calculateTotalPrice() {
    double totalPrice = 0;
    for (CartItem cartItem : cart) {
      totalPrice += cartItem.getItemPrice() * cartItem.getQuantity();
    }
    return totalPrice;
  }

  void displayCart() {
    for (CartItem crt : cart) {
      System.out.println("Item: " + crt.getItemName());
      System.out.println("Price: $" + crt.getItemPrice());
      System.out.println("Quantity: " + crt.getQuantity());
      System.out.println("--------------------------");
    }
    System.out.println("Total Price: $" + calculateTotalPrice());
  }

}

class Shopping {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    CartItem item1 = new CartItem("Item 1", 10.99, 2);
    CartItem item2 = new CartItem("Item 2", 5.99, 3);
    CartItem item3 = new CartItem("Item 3", 8.49, 1);

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);

    cart.displayCart();

    cart.removeItem("Item 2");

    cart.displayCart();
  }
}