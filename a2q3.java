package assignment2;

import java.util.Scanner;

class car {
    String model;
    int year;

    public  void setDetails(String model, int year) {
       this.model=model;
       this.year=year;
    }
    public void displayData(){
        System.out.println(model+ " is the model of the car" +year+ "of the car");

    }
}
public class a2q3 {
    public static void main(String[] args) {
        car cars1=new car();
        cars1.model="toyata";
        cars1.year=2020;
        car cars2=new car();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the model of the car");
        cars2.model=sc.nextLine();
        System.out.println("enter the year of the car ");
        cars2.year=sc.nextInt();
        if (cars1.year>cars2.year){
            System.out.println("cars1 is new");
        } else if (cars1.year<cars2.year){
            System.out.println("cars2 is new");
        }
        else{
            System.out.println("both are same");
        }





    }
}
