package sorts;
public class insertionSort {
    public long inSort(int[] a) {
        long timeStart = System.currentTimeMillis();
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (key < a[j]) {
                    a[j + 1] = a[j];
                    a[j] = key;
                }
                else
                    break;
            }
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
}