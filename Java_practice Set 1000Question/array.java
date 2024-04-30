import java.util.Scanner;

public class array {

    public int findSum(int[] arr, int startIdx, int numElements) {
        int sum = 0;

        for (int i = startIdx; i < startIdx + numElements && i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        array arraySum = new array();

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the starting index:");
        int startIdx = sc.nextInt();

        System.out.println("Enter the number of elements:");
        int numElements = sc.nextInt();

        int sum = arraySum.findSum(arr, startIdx, numElements);
        System.out.println("Sum of elements from index " + startIdx + " to index " + (startIdx + numElements - 1) + ": " + sum);

        sc.close();
    }
}
