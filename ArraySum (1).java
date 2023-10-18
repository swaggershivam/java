public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {3,2,4,6,7};

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

        int sum = 0;
        for(int i=0;i<arr.length;i++){ 
            sum = sum + arr[i];
        }
        System.out.println(sum);

        int sum1 = 0;
        for(int i=min;i<=max;i++){ 
            sum1 = sum1 + i;
        }

        int diff = sum1-sum;
        System.out.println("mising number is : "+diff);



    }
    
}
