package assignment2;
class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmloyeeInfo() {
        System.out.println("The name of the employee is :" + name);
        System.out.println("the salary of" +name+ "is" +salary);
    }
}
    class Manager extends Employee {
    String department;
    public Manager(String name,int salary,String department) {
        super(name,salary);
        this.department = department;
    }
        public void displayManagerDetails(){
            super.displayEmloyeeInfo();
            System.out.println("manager's department" +department);

        }

    }

public class a2q9 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 75000, "HR");
        manager.displayManagerDetails();
    }
}
