import java.io.*;
import java.util.*;

public class timeInWords {

    // Complete the timeInWords function below.
    static String timeInWord(int h, int m) {
		String hours = "", minutes = "", time = "", suffix = "", prefix = "";
		switch(m) {
		case 00:
			prefix = "Yes";
			minutes = "o' clock";
			break;
		case 15:
			minutes = "quarter past";
			break;
		case 30:
			minutes = "half past";
			break;
		case 45:
			minutes = "quarter to";
			h++;
			break;
		default:
			if(m > 30) {
				h++;
				m = 60 - m;
				suffix = "to";
			}
			else 
				suffix = "past";
			switch(m) {
			 case 1:minutes = "one minute";break;
			 case 2:minutes = "two minutes";break;
			 case 3:minutes = "three minutes";break;
			 case 4:minutes = "four minutes";break;
			 case 5:minutes = "five minutes";break;
			 case 6:minutes = "six minutes";break;
			 case 7:minutes = "seven minutes";break;
			 case 8:minutes = "eight minutes";break;
			 case 9:minutes = "nine minutes";break;
			 case 10:minutes = "ten minutes";break;
			 case 11:minutes = "eleven minutes";break;
			 case 12:minutes = "twelve minutes";break;
			 case 13:minutes = "thirteen minutes";break;
			 case 14:minutes = "fourteen minutes";break;
			 case 16:minutes = "sixteen minutes";break;
			 case 17:minutes = "seventeen minutes";break;
			 case 18:minutes = "eighteen minutes";break;
			 case 19:minutes = "nineteen minutes";break;
			 case 20:minutes = "twenty minutes";break;
			 case 21:minutes = "twenty one minutes";break;
			 case 22:minutes = "twenty two minutes";break;
			 case 23:minutes = "twenty three minutes";break;
			 case 24:minutes = "twenty four minutes";break;
			 case 25:minutes = "twenty five minutes";break;
			 case 26:minutes = "twenty six minutes";break;
			 case 27:minutes = "twenty seven minutes";break;
			 case 28:minutes = "twenty eight minutes";break;
			 case 29:minutes = "twenty nine minutes";break;
			}
	    }
		switch(h) {
			case 1:hours = "one";break;
			case 2:hours = "two";break;
			case 3:hours = "three";break;
			case 4:hours = "four";break;
			case 5:hours = "five";break;
			case 6:hours = "six";break;
			case 7:hours = "seven";break;
			case 8:hours = "eight";break;
			case 9:hours = "nine";break;
			case 10:hours = "ten";break;
			case 11:hours = "eleven";break;
			case 12:hours = "twelve";break;
			default:break;
		}
		if(prefix != "")
			time = hours + " " + minutes;
		else if(m == 15 || m == 30 || m == 45)
			time = minutes + " " + hours;
		else
			time = minutes + " " + suffix + " " + hours;
    	return time;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWord(h, m);

        System.out.println(result);
        scanner.close();
    }
}