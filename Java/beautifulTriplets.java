import java.io.*;
import java.util.*;

public class beautifulTriplets {

   	// Complete the beautifulTriplets function below. 
	static boolean findElement(int element, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element)
				return true;
			else
				continue;
		}		
		return false;
	}
	
	static int beautifulTriplet(int d, int[] arr) {
    	int count = 0;
		for(int i = 0; i < arr.length; i++) {
    		if(findElement(arr[i] + d, arr))
    			if(findElement(arr[i] + d + d, arr))
    				count++;
    	}
    	return count;
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplet(d, arr);

        System.out.println(result);
        scanner.close();
    }
}    