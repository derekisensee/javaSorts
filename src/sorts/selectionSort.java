package sorts;

/**
 * Created by isenseed on 11/30/2016.
 */
public class selectionSort {
    public static void selSort(int[] a) {
        int lowest = a[0];
        int lowIndex = 0;
        int currentIndex = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = currentIndex; i < a.length; j++) {
                if (a[j] < lowest) {
                    lowest = a[j];
                    lowIndex = j;
                }
            }
            for (int j = currentIndex; j < lowIndex; j++) { //count down instead so copying elements is easier?

            }
            currentIndex++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 23, 657, 43, 2, 356, 65};
        selSort(array);
    }
}