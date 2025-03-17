import java.util.Scanner; 
public class Internee extends Employee {
    
                //child class 
 private String language;
 Scanner sc = new Scanner(System.in);

 Internee(){

 }
  void Input(){
    super.input();
    System.out.println("enter internee language");
    language = sc.next();
  }

  void Display(){
    super.display();
    System.out.println("enter internee language" + language);
  }


}
