import java.util.Scanner;

public class Solution {
    private static int countOfSwaps = 0;
    
    private static void bubbleSort(int [] arr) { 
        if (arr == null)
            return;
        
        boolean isSwapped = true;
        int toReachEnd = 0;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 1; i < arr.length - toReachEnd; i++) {
                if (arr[i] < arr[i-1]) {
                    swap(arr, i, i-1);
                    isSwapped = true;
                }
            }
            toReachEnd++;
        }
    }
    
    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        countOfSwaps++;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] =  scan.nextInt();
        }
        scan.close();
        bubbleSort(array);

        System.out.println("Array is sorted in " + countOfSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }
}
