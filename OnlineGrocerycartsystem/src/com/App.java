package com;

import java.util.Scanner;

import com.entity.Product;
import com.implementation.Admin;
import com.implementation.Customer;

public class App {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Admin admin=new Admin();
     admin.addproduct(new Product(101, "Apple", 50, "Fruits"));
     admin.addproduct(new Product(102, "Banana", 30, "Fruits"));
     admin.addproduct(new Product(201, "Carrot", 40, "Vegetables"));
     admin.addproduct(new Product(201, "Onion", 20, "Vegetables"));
	admin.viewproduct();
	  System.out.println("Enter your user ID:");
      int userId = sc.nextInt();
      sc.nextLine();  // Consume newline
      System.out.println("Enter your username:");
      String username = sc.nextLine();
      Customer customer = new Customer(userId, username);

      boolean running = true;
      while (running) {
          System.out.println("\n1. View Cart\n2. Add to Cart\n3. Remove from Cart\n4. Checkout\n5. Exit");
          int choice = sc.nextInt();
          switch (choice) {
              case 1:
                  customer.viewcart();
                  break;
              case 2:
                  System.out.println("Enter product ID to add:");
                  int addId = sc.nextInt();
                  customer.addcart(addId);
                  break;
              case 3:
                  System.out.println("Enter product ID to remove:");
                  int removeId = sc.nextInt();
                  customer.removecart(removeId);
                  break;
              case 4:
                  customer.checkout();
                  running = false;
                  break;
              case 5:
                  running = false;
                  break;
              default:
                  System.out.println("Invalid choice.");
          }
      }
      sc.close();
  }
}

