import java.util.*;

public class newYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	System.out.println("Too chaotic");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
       
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            
            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}