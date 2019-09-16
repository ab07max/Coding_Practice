import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	Iterator<Integer> i = bill.iterator();
    	int billSum = 0, item = 0, item1 = bill.get(k);
    	while (i.hasNext()) {
    		item = i.next();
    		if(item == item1)
    			i.remove();
    		else
    			billSum = billSum + item;
    		continue;
    	}
    	if(b - billSum/2 == 0)
    		System.out.println("Bon Appetit");
    	else
    		System.out.println(Math.abs(b - billSum/2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}