import java.util.*;

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m){
    	int seqCounter = 0;
		for(int i = 0; i <= s.length - m; i++) {
			int sum = sumCalc(i, s, m);
			if(sum == d) 
				seqCounter++;
			else
				continue;
		}
    	return seqCounter;
    }
    
    static int sumCalc(int i, int[] s, int m){
		int sum = 0;
		for(int j = i; j < i+m; j++) {
			sum += s[j];
		}
    	return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
    }
}