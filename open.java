
import java.util.*;
class Main {

    // perform the bubble sort
    static void bubbleSort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < (size-1); i++) {

            // check if swapping occurs
            boolean swapped = false;

            // loop to compare adjacent elements
            for (int j = 0; j < (size-i-1); j++) {

                // compare two array elements
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;

        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] data = new int[size];
        System.out.println("enter your elements");
        for (int i = 0; i < size; i++) {
            int x = sc.nextInt();
            data[i] = x;
        }
        // call method using the class name
        Main.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order is:");
        System.out.println(Arrays.toString(data));
    }
}
