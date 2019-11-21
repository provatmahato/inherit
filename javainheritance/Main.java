package javainheritance;

public class Main {
    public static void main(String[] args) {
      Student std= new Student();
      std.init_Student();
      std.init_value();
      
      std.printStudent();
      std.printPerson();
      
      Teacher te= new Teacher();
      te.init_Teacher();
      te.init_value();
      
      te.printTeacher();
      te.printPerson();
        
    }
    
}
