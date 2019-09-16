import java.io.*;
import java.util.*;

public class encryptionString {

    // Complete the encryption function below.
    static String encryption(char[] s) {
    	int strlen = s.length, i =0;
    	double root = Math.sqrt(strlen);
    	int lower = (int) Math.floor(root);
    	int upper = (int) Math.ceil(root);
    	if(strlen > lower * upper)
    		lower++;
    	char[][] encrypt = new char[lower][upper];
    	for(int j = 0; j < lower; j++)
    		for(int k = 0;  k < upper && i < strlen; k++) {
    			encrypt[j][k] = s[i];
    			i++;
    		}
    	String str = "";
    	for(int j = 0; j < upper; j++) {
    		for(int k = 0; k < lower; k++) {
    			if(encrypt[k][j] == '\u0000')
    				continue;
    			else
    				str = str + encrypt[k][j];
    		}
    		str += " ";
    	}
    	str = str.trim();
    	return str;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String s = scanner.nextLine();
        s = s.replaceAll("\\s+", "");

        String result = encryption(s.toCharArray());

        System.out.println(result);
        
        scanner.close();
    }
}