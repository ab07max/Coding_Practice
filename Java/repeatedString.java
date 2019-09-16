import java.util.*;

public class repeatedString {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long count = 0;
        
        if(n > s.length()) {
            long repeat = n/s.length();
            long diff = n % repeat;
            for(char c: s.toCharArray()) {
                if(c == 'a')
                    count++;
            }
            count = count * repeat;
            for(int i=0;i<diff;i++) {
                if(s.charAt(i) == 'a')
                    count++;
            }    
        }
        else {
            int len = (int) n;
            s = s.substring(0,len+1);
            for(char c: s.toCharArray()) {
                if(c == 'a')
                    count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}