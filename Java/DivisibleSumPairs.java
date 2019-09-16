import java.util.*;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
    	int sumPairs = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i+1; j < n; j++) {
				if((ar[i] + ar[j]) % k == 0)
					sumPairs++;
				else
					continue;
			}
		}
    	return sumPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        in.close();
    }
}