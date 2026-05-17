import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student Management System");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);

        if(marks >= 40){
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}