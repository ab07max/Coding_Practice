import java.io.*;
import java.util.*;

public class hourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
		int maxSum = 0, sum = 0, k = 0, l = 0;
		for(int i = 0; i < 6; ++i) {
			for(int j = 0; j < 6; ++j) {
				sum += arr[i][j];
			}
			System.out.println();
		}
		return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
        scanner.close();
    }
}