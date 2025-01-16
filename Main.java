// Main.java

// Declare the Main class
public class Main {
  // Main method, the entry point of the program
  public static void main(String[] args) {
    // Create an array of integers
    int[] arr = {
      9,
      5,
      2,
      8,
      0,
      3,
      1,
      6
    };

    // Create an instance of QuickSort and use it to sort the array in descending order
    Sortable quickSort = new QuickSort();
    quickSort.sort(arr);
    
    // Print the sorted array using Quick Sort
    System.out.print("Quick Sort (Descending Order): ");
    printArray(arr);

    // Create another array of integers
    int[] arr2 = {
      9,
      5,
      2,
      8,
      0,
      3,
      1,
      6
    };
    
    // Create an instance of MergeSort and use it to sort the second array in descending order
    Sortable mergeSort = new MergeSort();
    mergeSort.sort(arr2);
    
    // Print the sorted array using Merge Sort
    System.out.print("Merge Sort (Descending Order): ");
    printArray(arr2);
  }

  // Helper method to print an array of integers
  private static void printArray(int[] arr) {
    for (int num: arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
