package assignment2;
import java.util.Scanner;
class complex {
    double real;
    double img;

    public void setData(double real,double img) {
        this.real=real;
        this.img=img;
    }

    public void displayData() {
        System.out.println(real + ": " + img);
    }

    public complex add(complex c1,complex c2) {
        complex result=new complex();
        result.setData(c1.real+c2.real,c1.img+c2.img);
        return result;


    }
}

public class a2q2 {
    public static void main(String[] args) {
        complex c1=new complex();
        c1.setData(4.0,5.0);
        complex c2=new complex();
        c2.setData(3.0,2.0);
        System.out.println();
        complex result=c1.add(c1,c2);
        System.out.println("sum of complex nos is");
        result.displayData();
    }

}
