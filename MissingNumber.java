public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5};
        int sum1=0;
        int sum2=0;
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            sum1 = sum1 + arr[i];
        }
        sum2 = n*(n+1)/2;
        int diff = sum2 - sum1;
        System.out.println("Missing number is " + diff);

    }
    
}
