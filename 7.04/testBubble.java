import java.util.Arrays;

public class testBubble {
    public static void main(String[] args) {
        int[] arr = { 34, 4, 56, 17, 90, 65 };
        int[] arr1 = sortArr(arr);
        for (int n : arr1) {
            System.out.println(n);
        }
        System.out.println(Arrays.toString(arr1));// [4,34,...]
    }

    public static int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];// 38
                    arr[j + 1] = arr[j] - arr[j + 1];// 34
                    arr[j] = arr[j] - arr[j + 1];// 4
                }
            }
        }
        return arr;
    }
}