package javainheritance;

import java.util.Scanner;

public class Person {
   protected String name;
   protected String address; 
   Scanner input = new Scanner(System.in);
    
   void init_value(){
   name=input.nextLine();
    address=input.nextLine();
  }

  void printPerson(){
      System.out.println("name = " + name);
      System.out.println("address = " + address);
  }
   
}
