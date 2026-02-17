
/**
 * Linear Search 
 *
 * Complexity time: O(n)
 * 
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 17.02.2026
 * @version 0.0.1
 */ 
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 5};
        int target = 7;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return the element was found by me =) 
            }
        }
        return -1;  // Element not found 
    }
}

