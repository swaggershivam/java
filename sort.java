public class sort {
    public static void main(String[] arng) {
        int arr[] = { 176, 2, 34, 4, 5, 6, 7, 8 };
        int t, le = arr.length;
        for (int i = 0; i < le; i++) {
            for (int j = i + 1; j < le; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;

                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}
