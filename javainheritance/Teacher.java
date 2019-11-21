package javainheritance;

public class Teacher extends Person{
  private String designation;
  private String research;  

  void init_Teacher(){
    System.out.println("input for teacher:");
    designation=input.nextLine();
    research=input.nextLine();
  }
  void printTeacher(){
      System.out.println("print teacher info:");
      System.out.println("designation = " + designation);
      System.out.println("research = " + research);
  }
  
}
