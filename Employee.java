
import java.util.Scanner; 
class Employee{
                                   //parent class
    private int id;
    private String name;
    private String address;

    Employee(){
        
    }
    //input function
    void input(){
        Scanner sc =new Scanner(System.in); 
        System.out.println("enter employee id :");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter employee name :");
        name = sc.nextLine();
        System.out.println("enter employee adderess :");
         //address = sc.next();
        address = sc.nextLine();
       }
       void display(){
        System.out.println("enter employee id :" + id);
        System.out.println("enter employee name :" + name);
        System.out.println("enter employee adderess :" + address);
       }
}
