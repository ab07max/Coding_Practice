import java.text.DecimalFormat;
import java.util.*;

public class kaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumber(int p, int q) {
        int len, count = 0;
        String s;
        double square;
        DecimalFormat df = new DecimalFormat("##");
        for(int i = p; i <= q; i++) {
            square = i * i;
            s = Double.toString(square);
            len = s.length();
            if(i == 1) {
                count++;
                System.out.print(i + " ");
            }
            else if(len == 1)
                continue;
            else if(Integer.parseInt(df.format(Double.parseDouble(s.substring(0, len/2)))) + Integer.parseInt(df.format(Double.parseDouble(s.substring(len/2, len)))) == i) {
                count++;
                System.out.print(i + " ");
            }
            else
                continue;
        }
        if(count == 0)
            System.out.print("INVALID RANGE");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumber(p, q);

        scanner.close();
    }
}