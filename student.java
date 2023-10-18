
import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;
        float marks;

        System.out.println("Enter your name");

        name = sc.nextLine();
        System.out.println("Enter your rollno");

        rollno = sc.nextInt();
        System.out.println("Enter your marks");
        marks = sc.nextFloat();

        System.out.println("Name=" + name);
        System.out.println("Rollno=" + rollno);
        System.out.println("Marks=" + marks);

        sc.close();
    }
}
