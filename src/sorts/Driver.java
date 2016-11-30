package sorts;
import java.io.*;
public class Driver {
    static int size = 2500;
    static int[] array = new int[size];
    static void refreshArray() {
        if (size == 80000)
            size = 5000;
        else
            size *= 2;
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 5000);
        }
    }

    public static void main(String[] args) throws IOException {
        FileWriter out = new FileWriter(new File("out.dat"));
        out.write("BUBBLE SORTS:\n");
        bubbleSort b = new bubbleSort();
        for (int i = 0; i < 5; i++) {
            refreshArray();
            out.write("run " + i + ": " + b.bubbleSorter(array) + "ms\tarray size: " + size + "\n");
        }

        out.write("\nINSERTION SORTS:\n");
        insertionSort i = new insertionSort();
        for (int j = 0; j < 5; j++) {
            refreshArray();
            out.write("run " + j + ": " + i.inSort(array) + "ms\tarray size: " + size + "\n");
        }

        out.write("\nSELECTION SORTS:\n");
        selectionSort s = new selectionSort();
        for (int j = 0; j < 5; j++) {
            refreshArray();
            //out.write("run " + j ": " + s.selSort(array) + "ms\tarray size: " + size + "\n");
        }

        out.flush();
        out.close();
    }
}