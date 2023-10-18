public class remove_duplicate {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 2, 3, 3, 4 };
        int st = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[st]) {
                st++;
                arr[st] = arr[i];
            }
        }
        for (int i = 0; i <= st; i++) {
            System.out.println(arr[i]);
        }
    }
}