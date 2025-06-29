package assignment2;
import java.util.Scanner;
class Shape {
     String color;

    public Shape(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println(color);
    }
}
    class Circle extends Shape {
         double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double area() {
            return Math.PI * (radius * radius);
        }

        @Override
        public void display() {
            System.out.println("Circle Color: " + color + ", Area: " + String.format("%.2f", area()));
        }
    }
        class Rectangle extends Shape{
            double l;
            double w;
            public Rectangle( String color,double l,double w){
                super(color);
                this.l=l;
                this.w=w;
            }
            public double area(){
                return l*w;
            }
            @Override
            public void display(){
                System.out.println(l+ " :" +w);
                System.out.println(area());

            }
        }




public class a2q7 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("blue",0.5,0.6);
        System.out.println("Circle Details:");
        circle.display();
        System.out.println();
        System.out.println("Rectangle Details:");
        rectangle.display();
    }
}
