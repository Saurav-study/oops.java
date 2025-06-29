package assignment2;
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    String name ;
    public Duck(String name){
        this.name=name;
    }
    @Override
    public void fly(){
        System.out.println(name+ "is flying");
    }
    @Override
    public void swim(){
        System.out.println(name+ "is swimming");
    }
    public void displayData(){
        System.out.println("name of the duck is "+name);
        fly();
        swim();
    }
}
public class a2q8 {
    public static void main(String[] args) {
        Duck duck=new Duck("Donald");
        duck.fly();
        duck.swim();
        duck.displayData();


    }
}
