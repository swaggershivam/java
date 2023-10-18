import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int originalNumber , remainder , sum = 0 , num, count =0;
        System.out.println("Enter the number: ");
        num = s.nextInt();
        originalNumber = num;
        while(num > 0){
            count = count +1;
            num /= 10;
        }
        num=originalNumber;
        while(num!=0){
            remainder = num % 10;
            sum = sum + (int) Math.pow(remainder, count);
            num = num/10;
        }
        if(sum == originalNumber){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("not Armstrong Number");
        }
        s.close();
    }
}
