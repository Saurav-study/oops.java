package assignment2;//package assignment2;
//import java.util.Scanner;
//class student {
//    int roll;
//    String name;
//     double DSA_Mark;
//     public void getData(int roll,String name ,int dsaMark){
//         this.roll=roll;
//         this.name=name;
//         this.DSA_Mark=dsaMark;
//     }
//     public void showData(){
//         System.out.println(name+ "is the name of the person"+roll+ "is roll nos with marks in dsa" +DSA_Mark);
//     }
//     public double getDSAMark(){
//         return this.DSA_Mark;
//     }
//}
//public class ha2q1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        student[] students = new student[5];
//        for (int i = 0; i < 5; i++) {
//            students[i] = new student();
//            System.out.println("enter details for student" + (i + 1) + ":");
//            System.out.println("roll nos");
//            int roll = sc.nextInt();
//            System.out.println("name");
//            String name = sc.nextLine();
//            System.out.println("DSA Mark:");
//            double dsaMark = sc.nextInt();
//            students[i].getData(roll, name, dsaMark);
//            System.out.println();
//        }
//        int highestDSAMarks = students[0].getDSAMark();
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getDSAMark() > highestDSAMarks) {
//                highestDSAMarks = students[i].getDSAMark;
//            }
//        }
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getDSAMarks() == highestDSAMarks) {
//                students[i] = showData();
//
//            }
//        }
//    }}
import java.util.Scanner;

class Student {
    int Roll;
    String Name;
    int DSA_Mark;
    public void getdata(int roll, String name, int dsaMark) {
        this.Roll = roll;
        this.Name = name;
        this.DSA_Mark = dsaMark;
    }
    public void showdata() {
        System.out.println("Roll: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Mark: " + DSA_Mark);
        System.out.println();
    }
    public int getDSAMark() {
        return this.DSA_Mark;
    }
}

public class ha2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("DSA Mark: ");
            int dsaMark = scanner.nextInt();
            students[i].getdata(roll, name, dsaMark);
            System.out.println();
        }
        int highestDSAMark = students[0].getDSAMark();
        for (int i = 1; i < students.length; i++) {
            if (students[i].getDSAMark() > highestDSAMark) {
                highestDSAMark = students[i].getDSAMark();
            }
        }
        System.out.println("Students with the highest DSA Mark (" + highestDSAMark + "):");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDSAMark() == highestDSAMark) {
                students[i].showdata();
            }
        }
    }
}



