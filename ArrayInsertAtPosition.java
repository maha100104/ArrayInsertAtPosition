public class ArrayInsertAtPos {
    public static void result(int arr[], int n, int pos, int key) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
            if (i == pos) {
                arr[pos] = key;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5;
        int pos = 3;
        int key = 6;
        result(arr, n, pos, key);
        n += 1;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
output: 2 3 1 6 8 5
*/
