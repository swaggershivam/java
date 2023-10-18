public class ArrayPair {
    public static void main(String[] args) {
        int arr[] = {3,2,4,6,7};
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[i] + arr[j] == 10){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    
}
