package javainheritance;

public class Student extends Person{
   protected String Id;
   protected double cgpa;
   
    void init_Student(){
        System.out.println("input for student:");
    Id=input.nextLine();
    cgpa=input.nextDouble();
    input.nextLine();
  }
    
     void printStudent(){
         System.out.println("print student info:");
         System.out.println("id = " + Id);
         System.out.println("cgpa = " + cgpa);
  }
}
