public class pivat {

    public static int pivat(int[] arr){
        int n=arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        int leftSide = 0;
        int rightSide = sum;
        for(int i=0;i<n;i++){
            rightSide=rightSide-arr[i];
            if(leftSide == rightSide){
                return i;
            }
                leftSide = leftSide+arr[i];
            
        }
        return -1;



    }
    public static void main(String[] args) {
        int[] arr = {2,1,2,4,5};
        int pivot = pivat(arr);
    }
    
}
