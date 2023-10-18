import java.util.Scanner;
public class HollowTriangle{
   public static void main(String[] args){
      int my_input, i, j;
      Scanner my_scanner = new Scanner(System.in);

      System.out.print("Enter the size : ");
      my_input = my_scanner.nextInt();
      
      for( i=1;i<=my_input;i++){
         if(i==1 || i==my_input)
         for( j=1;j<=i;j++){
            System.out.print("*");
         } else {
             for( j=1;j<=i;j++){
                if(j==1 || j==i)
                   System.out.print("*");
                else
                   System.out.print(" ");
            }
         }
      System.out.println();
      }
   }
}
