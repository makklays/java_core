
/**
 * Quick Sort
 *
 * Complexity time:
 * best case     - O(n log n)
 * average case  - O(n log n)
 * worst case    - O(n²)
 */ 
class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,8,4,7};

        quickSort(arr, 0, arr.length - 1);

        for(int num : arr) {
            System.out.println(num + " ");
        }
    } 

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot.length - 1);
            quickSort(arr, pivot.length + 1, high);
        }
    }

    public partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2];
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

