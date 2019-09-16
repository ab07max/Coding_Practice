import java.io.*;
import java.util.*;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
    	int matchCount = 0;
    	int lcmOfA = lcmFunc(a);
    	int minOfB = minOfB(b);
    	int multiple = 1;
    	while(lcmOfA * multiple <= minOfB) {
    		int noOfElementsDivisible = noOfElementsDivisible(lcmOfA * multiple, b);
    		if(noOfElementsDivisible == b.length) {
    			matchCount++;
    			multiple++;
    		}
    		else
    			multiple++;
    	}
    	return matchCount;
    }
    
	static int lcmFunc(int[] a) {
    	int lcm = maxOfA(a);
    	boolean lcmFound = false;
    	do {
    		int noOfElementsDivisible = noOfElementsDivisible(lcm, a);
    		if(noOfElementsDivisible == a.length)
    			lcmFound = true;
    		else
    			lcm++;
    	} while(!lcmFound);
    	return lcm;
    }
	
	static int noOfElementsDivisible(int n, int[] a) {
		int noOfelementsDivisible = 0;
		for(int i = 0; i < a.length; i++) {
			if(n % a[i] == 0 || a[i] % n == 0)
				noOfelementsDivisible++;
			else
				continue;
		}
		return noOfelementsDivisible;
	}
    
    static int maxOfA(int[] a) {
    	int maxOfA = a[0];
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] > maxOfA)
    			maxOfA = a[i];
    	}
    	return maxOfA;
    }
    
    static int minOfB(int[] b) {
		int minOfB = b[0];
		for(int i = 0; i < b.length; i++) {
			if(b[i] < minOfB)
				minOfB = b[i];
		}
    	return minOfB;
	}

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        System.out.println(total);
    }
}