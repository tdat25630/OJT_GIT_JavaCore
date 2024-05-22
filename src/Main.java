import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array: " + Arrays.toString(array));

        parallelBubbleSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void parallelBubbleSort(int[] array) {
        int mid = array.length / 2;

        // Create two threads to sort each half of the array
        Thread t1 = new Thread(() -> bubbleSort(array, 0, mid));
        Thread t2 = new Thread(() -> bubbleSort(array, mid, array.length));

        t1.start();
        t2.start();

        // Wait for both threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Merge the two sorted halves
        merge(array, 0, mid, array.length);
    }

    private static void bubbleSort(int[] array, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            for (int j = start; j < end - 1 - (i - start); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start];
        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i < mid) {
            temp[k++] = array[i++];
        }

        while (j < end) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, start, temp.length);
    }
}
