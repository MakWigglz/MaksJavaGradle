// MergeSort.java

// Declare the MergeSort class, which implements the Sortable interface
class MergeSort implements Sortable {
    // Implement the "sort" method required by the Sortable interface
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    // Helper method for the MergeSort algorithm
    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            // Calculate the middle index
            int mid = (low + high) / 2;
            
            // Recursively sort the left and right sub-arrays
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            
            // Merge the sorted sub-arrays
            merge(array, low, mid, high);
        }
    }

    // Helper method to merge two sub-arrays
    private void merge(int[] array, int low, int mid, int high) {
        // Calculate the sizes of the left and right sub-arrays
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        // Create temporary arrays to hold the left and right sub-arrays
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy elements from the original array to the left and right sub-arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[low + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        // Merge the two sub-arrays back into the original array
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] >= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left and right sub-arrays
        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
} 
