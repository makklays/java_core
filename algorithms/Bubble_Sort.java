/**
 * Bubble Sort 
 * 
 * Проходим по массиву несколько раз.
 * Сравниваем соседние элементы и меняем их местами, если они в неправильном порядке.
 * После каждого прохода самый большой элемент «всплывает» в конец массива.
 * Если за один проход не произошло ни одного обмена, сортировка завершена.
 *
 * Complexity time: 
 * best case    - O(n)
 * average case - O(n^2)
 * waorst case  - O(n^2)
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 17.02.2026
 * @version 0.0.1 
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 1, 5, 6};
        System.out.println("Original array: ");
        printArray(arr);

        bubbleSort(arr);  // sort array 

        System.out.println("Sorted array: ");
        printArray(arr);        
    }

    // Sorts the array in ascending order using Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false; 
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {   // ascending order; use < for descending
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;  // swap occurred
                }
            }

            // if no swaps occurred, array is already sorted 
            if (!swapped) {
                break;
            }
        }
    }

    // Utility method to print array 
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

