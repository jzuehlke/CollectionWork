package us.mattgreen;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static FileInput indata = new FileInput("the_book.csv");
    private final static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {
        String line;
        String[] words;
        Object wordFound;
        //String[] fields;

        while ((line = indata.fileReadLine()) != null) {
            line=line.replace(",","").replace(".","")
                    .replace(";","").replace(":","")
                    .replace("'","").replace("\"","")
                    .replace("-","").replace("!","")
                    .replace("#","").replace("(","")
                    .replace(")","").replace("?","")
                    .replace("_","").replace("?","")
                    .toLowerCase().trim();
            words = line.split(" ");
            for (String s:words) {
                wordFound = map.get(s);
                if (wordFound == null) {
                    map.put(s, new Integer(1));
                }
                else {
                    map.put(s, map.get(s) + 1);
                }
            }
        }

        int uniqueWordCount = 0;
        int highest = 0;
        String mostUsedWord = "";

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                uniqueWordCount++;
                //System.out.println(entry.getKey() + " " + entry.getValue());
            }
            if(entry.getValue() > highest)
            {
                highest = entry.getValue();
                mostUsedWord = entry.getKey();
            }
        }
        System.out.println("Number of unique words: " + uniqueWordCount);
        System.out.println("Most Used Words: " + mostUsedWord + " " + highest);
    }
    
}