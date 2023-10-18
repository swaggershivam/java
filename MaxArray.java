public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max element is : " +max);



        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min element is : " +min);

        int Max1 = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Max1 < arr[i])
                Max1 = arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            if(secMax < arr[i] && arr[i] != Max1){
                secMax = arr[i];
            }
        }
        System.out.println("The second max is : "+ secMax);
    }
    
}
