package sorts;
public class bubbleSort {
    public long bubbleSorter(int[] a) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }
}