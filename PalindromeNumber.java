import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num , reverse = 0 , remainder , temp;
    System.out.println("enter the number : ");
    num = s.nextInt();
    temp = num;
    while(temp != 0){
        remainder = temp % 10;
        reverse = reverse * 10 + remainder;
        temp = temp / 10;
    }
    if(num == reverse){
        System.out.println("Number is palindrome");
    }else{
        System.out.println("Number is not palindrome");
    }
    s.close();

}  
    
}
