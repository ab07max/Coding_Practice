import java.io.*;
import java.util.*;

public class jumpingOnClouds {

    static int jumpingOnCloud(int[] c) {
        int i = 0, hop = 0, len = c.length;
        do {
            if(c[i + 1] == 0) {
                if(i + 2 < len && c[i + 2] == 0)
                    i+=2;
                else
                    i++;
            }
            else if(i + 1 == len)
                break;
            else
                i+=2;
            hop++;
        } while(i + 1 < len);
        return hop;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnCloud(c);

        System.out.println(result);
        scanner.close();
    }
}