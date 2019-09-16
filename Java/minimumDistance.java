import java.io.*;
import java.util.*;

public class minimumDistance {

	static int findElement(int element, int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				count++;
				if(count == 2)
					return i;
			}
			else
				continue;
		}
		return 0;
	}
	
	// Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	int index, minDistance = Integer.MAX_VALUE, distance;
		for(int i = 0; i < a.length; i++) {
			index = findElement(a[i], a);
			if(index == 0)
				continue;
			else {
				distance = Math.abs(index - i);
				if(distance == 0)
					continue;
				else if(minDistance > distance)
					minDistance = distance;
				else
					continue;
			}
		}
    	return minDistance;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);
        
        if(result == Integer.MAX_VALUE)
        	result = -1;

        System.out.println(result);
        scanner.close();
    }
}