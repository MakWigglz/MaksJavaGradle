// QuickSort.java

// Declare the QuickSort class, which implements the Sortable interface
class QuickSort implements Sortable {
    // Implement the "sort" method required by the Sortable interface
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Helper method for the QuickSort algorithm
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index using the "partition" method
            int partitionIndex = partition(array, low, high);
            
            // Recursively sort the sub-arrays before and after the partition index
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Helper method to partition the array
    private int partition(int[] array, int low, int high) {
        // Choose the pivot element, which is the element at the "high" index
        int pivot = array[high];
        int i = low - 1;

        // Iterate through the elements in the array
        for (int j = low; j < high; j++) {
            // If the current element is greater than or equal to the pivot, swap elements
            if (array[j] >= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at the (i + 1) index
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition index
        return i + 1;
    }
} 
