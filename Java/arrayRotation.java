import java.io.*;
import java.util.*;

public class arrayRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d, int n) {
		int[] b = new int[n];
		int j = 0;
    	for(int i = d; i < n; i++, j++)
    		b[j] = a[i];
    	for(int i = 0; i < d; i++, j++)
    		b[j] = a[i];
		return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d, n);

        for (int i = 0; i < result.length; i++) {
        	System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        scanner.close();
    }
}