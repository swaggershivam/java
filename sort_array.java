public class sort_array {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1 };
        int le = arr.length;
        int zero = 0;
        for (int i : arr) {
            if (i == 0)
                zero++;
        }
        for (int i = 0; i < le; i++) {
            if (i < zero)
                System.out.print("o ");
            else
                System.out.print("1 ");
        }
    }
}