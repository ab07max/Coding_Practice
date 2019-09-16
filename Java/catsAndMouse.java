import java.io.*;
import java.util.*;

public class catsAndMouse {
	
    static String catAndMouse(int x, int y, int z) {
    	switch(Integer.compare(Math.abs(x - z), Math.abs(y - z))) {
    		case -1: return "Cat A";
    		case 1: return "Cat B";
    	}
    	return "Mouse C";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
	    int q = in.nextInt();
	    List<String> list = new ArrayList<String>();
	    
	    for (int qItr = 0; qItr < q; qItr++) {
	    	String[] xyz = scanner.nextLine().split(" ");
	        int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            String result = catAndMouse(x, y, z);
            list.add(result);
	    }
	    
	    Iterator<String> itr = list.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    in.close();
	}
}