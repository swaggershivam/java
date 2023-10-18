import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    String ch = s.next();
    switch (ch) {
        case"+":
            System.out.println(a+b);
            break;
        case"-":
            System.out.println(a-b);
            break;
        case"*":
            System.out.println(a*b);
            break;
        case"/":
            System.out.println(a/b);
            break;
        case"%":
            System.out.println(a%b);
            break;
        default:
            System.out.println("wrong");
            break;
    }
    s.close();
}
    
}
