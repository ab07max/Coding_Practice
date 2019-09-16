import java.io.*;
import java.util.*;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
    	int[] result = new int[2];
    	int max = score[0], min = score[0];
    	for(int i = 0; i < score.length; i++) {
    		if(score[i] > max) {
    			max = score[i];
    			result[0]++;
    		}
    		else if(score[i] < min) {
    			min = score[i];
    			result[1]++;
    		}
    		else
    			continue;
    	}
		return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(result[resultItr]);
            if (resultItr != result.length - 1) {
                System.out.println(" ");
            }
        }
    }
}