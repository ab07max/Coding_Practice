import java.util.ArrayList;
import java.util.List;

public class keywordList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String literatureText = "Jack and Jill went up the hill";
		//This is the given literature text input as string
		
		String repetitiveText = "and a the in on he she it was";
		List<String> repetitiveTextList = new ArrayList<>();
		String tempArray[] = repetitiveText.split(" ");
		for(String key: tempArray) 
			repetitiveTextList.add(key);
		//This is repetitive text as a List
		
		String literatureTextArray[] = literatureText.split(" ");
		List<String> keywordList = new ArrayList<>();
		
		//Now Comparing literature text and repetitive text
		for(String key1: literatureTextArray) {
			boolean isKeyPresent = false;
			for(String key2:repetitiveTextList) {
				if(key1.equals(key2))
					isKeyPresent = true;
				else
					continue;
			}
			//if literature text element is not present in repetitive text then continue
			if(!isKeyPresent) {
				boolean isKeywordPresent = false;
				for(String temp: keywordList) {
					if(temp.equals(key1))
						isKeywordPresent = true;
					else
						continue;
				}
				//if the keyword list doesn't contain the literature element already then add it
				if(!isKeywordPresent)
					keywordList.add(key1);
			}
		}
		//printing final output can add a return statement instead
		for(String temp: keywordList) {
			System.out.println(temp);
		}
	}
}
