import java.util.*;

public class linearsearch{
    public static int search(int array[], int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];

        System.out.println("Enter 6 elements:");
        for (int i = 0; i < 6; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element you need to search:");
        int data = sc.nextInt();

        int result = search(array, data);
        if (result != -1) {
            System.out.println("The number is present at index: " + result);
        } else {
            System.out.println("The number is not found in the array.");
        }
    }
}
