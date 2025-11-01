package DataStructure_Basic;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSortDescendingOrder(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        linearSearch(arr, 4);

    }

    //Insertion Sort in ascending order
    private static void insertionSort(int[] arr) {
        for(int i =1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key;
        }

    }
//Rewrite the INSERTION-SORT procedure to sort into monotonically decreasing instead of monotonically increasing order.

    private static void insertionSortDescendingOrder(int[] arr) {
        for(int i =1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

            /*
        Consider the searching problem:
Input: A sequence of n numbers 〈a1,a2, … ,an〉 stored in array A[1 : n] and a value x.
Output: An index i such that x equals A[i] or the special value NIL if x
does not appear in A.
Write pseudocode for linear search, which scans through the array
from beginning to end, looking for x. Using a loop invariant, prove that
your algorithm is correct. Make sure that your loop invariant fulfills the
three necessary properties.
         */

    private static void linearSearch(int[] arr, int x) {
        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
