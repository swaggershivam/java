import java.util.Arrays;

public class ZeroOne {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,2,0,1,2,1,0};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]==0){
                count1++;
            }
            if(arr[i]==1){
                count2++;
            }
            if(arr[i]==2){
                count3++;
            }
        }

        int i = 0;
        while(count1!=0){
            arr[i] = 0;
            i++;
            count1--;
        }
        while(count2!=0){
            arr[i] = 1;
            i++;
            count2--;
        }
        while(count3!=0){
            arr[i] = 2;
            i++;
            count3--;
        }

        System.out.println(Arrays.toString(arr));

    }
    
}
