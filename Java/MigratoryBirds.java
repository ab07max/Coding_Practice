import java.util.*;

public class MigratoryBirds {
	
    static int migratoryBirds(int n, int[] ar) {
		long startTime = System.nanoTime();
    	int[] arr = new int[5];
    	int max = 0, answer = 0;
    	for(int i = 0; i < n; i++) {
    		switch(ar[i]) {
    		case 1:arr[0]++;
    		break;
    		case 2:arr[1]++;
    		break;
    		case 3:arr[2]++;
    		break;
    		case 4:arr[3]++;
    		break;
    		case 5:arr[4]++;
    		break;
    		}
    	}
    	for(int i = 0; i < 5; i++) {
    		if(arr[i] > max) {
    			max = arr[i];
    			answer = i+1;
    		}	
    	}
    	long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
    	return answer;
    }
	
//	static int maxSighting = 0;
//	static int[] maxSightingArray = new int[5];
//	static int maxBirdType = 0;
//	
//	static int migratoryBirds(int n, int[] ar) {
//		long startTime = System.nanoTime();
//    	int frequency = 0, i = 0, k =0;
//    	maxSightingArray = ar.clone();
//		do {
//			if(maxSightingArray[i] == 0)
//				continue;
//			else {
//				for(int j = 0; j < n; j++) {
//					if(maxSightingArray[j] == ar[i]) {
//						frequency++;
//						maxSightingArray[j] = 0;
//						k = j + 1;
//					}
//					else
//						continue;
//				}
//				if(frequency > maxSighting) {
//					maxSighting = frequency;
//					maxBirdType = ar[i];
//				}	
//				frequency = 0;
//				i = k;
//			}
//		} while(i < n);
//		long endTime = System.nanoTime();
//		System.out.println("Took "+(endTime - startTime) + " ns");
//    	return maxBirdType;
//    }

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
        in.close();
    }
}