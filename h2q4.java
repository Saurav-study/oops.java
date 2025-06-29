/*Define a base class Distance with the following instance variables:
        • feet (an integer representing the distance in feet)
• inches (an integer representing the distance in inches)
The Distance class should have:
        • A constructor to initialize feet and inches.
• A method displayDistance() to display the distance in the format: feet' inches".
Now, define a derived class Measurement that extends the Distance class and adds an additional instance
        variable centimetres (a double representing the distance in centimetres).
The Measurement class should:
        • Have a constructor that uses the super keyword to call the Distance class's constructor to initialize
feet and inches.
• Include a centimetres field, which should be initialized in the constructor.
        • Implement a method displayMeasurement() that calls the displayDistance() method from the
Distance class (using super) to display the distance in feet and inches, and also displays the distance
in centimeters.*/
        package assignment2;
        abstract class Distance {
            double feet;
            double inches;

            public Distance(double feet, double inches) {
                this.feet = feet;
                this.inches = inches;
            }
            public void displayDistance() {
                System.out.println(feet + " :" + inches);
            }
        }
        class Measurement extends Distance {
            double centimeter;
            public  Measurement(double feet, double inches, double centimeter) {
                super(feet,inches);
                this.centimeter = centimeter;
            }
            public void displayMeasurement(){
                super.displayDistance();
                System.out.println(centimeter);
            }
        }
public class h2q4 {
    public static void main(String[] args) {
        Measurement mes=new Measurement(22.2,3243.4,453.23);
        mes.displayMeasurement();
        }
    }

