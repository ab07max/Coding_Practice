import java.io.*;
import java.util.*;

public class sockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchants(int n, List<Integer> ar) {
    	int result = 0, count = 0, x = 0, y = 0;
    	List<Integer> temp = new ArrayList<>();
    	int len = ar.size();
    	for (int i = 0; i < len; i++) {
    		x = ar.get(i);
    		if (!temp.contains(x)) {
    			temp.add(x);
    			for (int j = i + 1; j < len; j++) {
    				y = ar.get(j);
    				if (x == y)
    					count ++;
        			else
        				continue;
    			}
    			if (count % 2 == 0)
    				result = result + count/2;
    			else
    				result = result + count/2 + 1;
    			count = 0;
    		}
    		else
    			continue;
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
  
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> ar = new ArrayList<Integer>();

        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar.add(arItem);
        }

        int result = sockMerchants(n, ar);
        System.out.println(result);

        scanner.close();
    }
}
