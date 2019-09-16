import java.io.*;
import java.util.*;

public class DrawingBook {
    static int pageCount(int n, int p) {
		int pageCount = minPageTraversal (n, p);
		return pageCount;
    }
    
    private static int minPageTraversal(int n, int p) {
    	if(p - 1 < n - p)
    		return forwardPageTraversal(n, p);
    	else 
    		return totalPageTraversals(n, p) - forwardPageTraversal(n, p);
	}
    
    private static int totalPageTraversals(int n, int p) {
		int count = 0;
		if (n == 1)
			return 0;
		else {
			count ++;
			for (int i = 2; i <= n && i + 1 < n; i += 2)
				count++;
	    	return count;
		}
	}

	private static int forwardPageTraversal(int n, int p) {
    	int count = 0;
    	if (p == 1)
    		return 0;
    	else {
    		count++;
    		for (int i = 2; i <= p && i + 1 < p; i += 2)
    			count ++;
        	return count;
    	}
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        
        int p = scanner.nextInt();
        
        int result = pageCount(n, p);    
        System.out.println(result);
    
        scanner.close();
    }
}