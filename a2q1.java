package assignment2;
import java.util.Scanner;
class person {
    String name;
    int age;
    public  void setData(String name,int age){
       this.name=name;
       this.age=age;
    }
    public void displayData(){
        System.out.println("name of the person is " +name+"and the age of the person is " +age);
    }

}

public class a2q1 {
    public static void main(String[] args) {
       person person1=new person();
       person1.name="saurav";
       person1.age=20;
       person person2=new person();
       Scanner sc = new Scanner(System.in);
        System.out.println("enter name of 2nd person");
       String name = sc.nextLine();
        System.out.println("entr age of the 2nd person");
       int age = sc.nextInt();
       person2.setData(name , age);
       person1.displayData();
       person2.displayData();

        if (person1.age < person2.age) {
            System.out.println("\n" + person1.name + " is younger.");
        } else if (person2.age < person1.age) {
            System.out.println("\n" + person2.name + " is younger.");
        } else {
            System.out.println("\nBoth persons are of the same age.");
        }

    }
}
