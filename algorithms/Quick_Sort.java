
/**
 * Quick Sort
 *
 * Complexity time:
 * best case     - O(n log n)
 * average case  - O(n log n)
 * worst case    - O(n²)
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 17.02.2026
 * @version 0.0.1 
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 4, 7};

        quickSort(arr, 0, arr.length - 1);

        for(int num : arr) {
            System.out.println(num + " ");
        }
    } 

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);  // Partitions the array and returns the pivot index.

            quickSort(arr, low, pivot.length - 1);  // Elements smaller than the pivot go to the left
            quickSort(arr, pivot.length + 1, high); // Elements greater than the pivot go to the right
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2];    // int 5 / int 2 = int 2.5 -> 2 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    } 
}

