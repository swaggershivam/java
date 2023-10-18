
public class DigitAdd {
    public static void main(String[] args) {
        int n=12345,digit=0;
        int a=n;
        while(a != 0){
           
            
            digit++;
            a = a/10;

        }
        System.out.println(digit);
    }
    
}
