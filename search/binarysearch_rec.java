import java.util.Scanner;

public class binarysearch_rec {
    public static int search(int array[], int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid; 
            } else if (array[mid] > target) {
                return search(array, target, start, mid - 1); 
            } else {
                return search(array, target, mid + 1, end); 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[8];

        System.out.println("Enter 8 elements (sorted):");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element you need to search:");
        int data = sc.nextInt();

        int index = search(array, data, 0, 7);
        if (index != -1) {
            System.err.println("The index of the element is: " + index);
        } else {
            System.err.println("Element not found in the array.");
        }
    }
}
