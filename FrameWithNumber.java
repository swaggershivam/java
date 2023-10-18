public class FrameWithNumber {
    public static void main(String[] args) {
        int i,j;
        for(i=4;i>=1;i--){
            for(j=4;j>=i;j--){
                System.out.print(j);
            }
            for(j=1;j<(i*2)-1;j++){
                System.out.print(i);
            }
            for(j=i+1;j<=4;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=2;i<=4;i++){
            for(j=4;j>=i;j--){
                System.out.print(j);
            }
            for(j=1;j<(i*2)-1;j++){
                System.out.print(i);
            }
            for(j=i+1;j<=4;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
