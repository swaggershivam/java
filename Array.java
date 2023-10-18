import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[4];
        arr[0]=1;
        System.out.println(Arrays.toString(arr));

        String[] myString = new String[3];
        myString[0]="Ayush Tyagi"; 
        myString[1] = "HarshVardhan";
        System.out.println(Arrays.toString(myString));

        int dy[] = new int[6];
        for(int i=0;i<dy.length;i++){
            System.out.print("Enter your value : ");
            dy[i]=s.nextInt();
        }
        for(int i=0;i<dy.length;i++){
            System.out.print(dy[i]+" ");
        }
        s.close();
    }
    
}
