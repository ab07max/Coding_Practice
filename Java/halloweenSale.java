import java.io.*;
import java.util.*;

public class halloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
    	int i = p, games = 0;
    	while(i <= s) {
    		games++;
    		if(p - d > m) {
    			i += p - d;
    			p -= d;
    		}
    		else
    			i += m;
    	}
    	return games;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        System.out.println(answer);

        scanner.close();
    }
}