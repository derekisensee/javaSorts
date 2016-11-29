package sorts;
import java.io.*;
public class Driver {
    static int[] array = new int[10000];
    static void refreshArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 5000);
        }
    }

    public static void main(String[] args) throws IOException{
        FileWriter out = new FileWriter(new File("out.dat"));
        out.write("BUBBLE SORTS:\n");
        bubbleSort s = new bubbleSort();
        for (int i = 0; i < 5; i++) {
            refreshArray();
            out.write("run " + i + ": " + s.bubbleSorter(array) + "ms\n");
        }


        out.flush();
        out.close();
    }

}