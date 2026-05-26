
class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Marks: " + marks);
    }
}

public class task1 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Mandar");
        s1.setAge(19);
        s1.setMarks(95);

        s1.displayInfo();

        System.out.println("\nPass or Fail ?:");

        if (s1.getMarks() >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        System.out.println("\nNumbers from 1 to 5 using loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

     
        System.out.println("\nArray:");

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        for(int num: numbers){
            System.out.print(num+" ");
        }

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("\nSum of array elements: " + sum);

     
    }
}
