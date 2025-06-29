package assignment2;
class Person{
    String name;
    int age;
    public  Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class OLO extends Person{
    int eid;
    double salary;
    public OLO(String name, int age, int eid, double salary){
        super(name,age);
        this.eid=eid;
        this.salary=salary;
    }
    public void empDisplay(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(eid); System.out.println(salary);
    }
}
public class h2q2 {
    public static void main(String[] args) {
        OLO emp=new OLO("choudharyjii",20,20,120000.0);
        emp.empDisplay();
    }
}
