import java.io.*;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            int marks = sc.nextInt();

            FileWriter w1 = new FileWriter("students.txt");

            w1.write("Student Name: " + name + "\n");
            w1.write("Student Marks: " + marks);
            w1.close();

            System.out.println("\nData written successfully.");

            FileReader r1 = new FileReader("students.txt");
            int ch;
            System.out.println("\nReading File Content:\n");

            while ((ch = r1.read()) != -1) {
                System.out.print((char) ch);
            }
            r1.close();

        } catch (IOException e) {
            System.out.println("File not found.  Error: " + e.getMessage());
        }

    }
}

