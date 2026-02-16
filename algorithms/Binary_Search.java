
/**
 * Binary Search 
 * 
 * Complexity time:
 * best case    - O(1)
 * average case - O(log n)
 * worst case   - O(log n)
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 17.02.2026
 * @version 0.0.1 
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 9, 11, 12};
        int target = 7;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high + low) / 2;

            if (arr[mid] == target) {
                return mid;           // element found 
            } else if (arr[mid] < target) {
                low = arr[mid] + 1;   // search in the right half
            } else {
                high = arr[mid] - 1;  // search in the left half
            }
        }

        return -1;  // element not found
    }
}

