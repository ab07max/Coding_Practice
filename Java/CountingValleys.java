import java.io.*;
import java.util.*;

public class CountingValleys {
	
    static int countingValleys(int n, String s) {
    	
    	int level = 0, valleys = 0;
    	char[] path = s.toCharArray();
		
    	for(int i = 0; i < n; i++) {
			
    		switch(path[i]) {
				case 'D':
					level--;
					break;
				case 'U':
					level++;
					if(level == 0)
						valleys++;
					break;
				default:
					break;
			}
    		
		}
    	
    	return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
        scanner.close();
    }
}
