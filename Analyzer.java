import java.io.*;
import java.io.BufferedReader;    
import java.io.FileReader;    
import java.util.ArrayList;    
import java.util.*;


public class Analyzer {

	public static void main(String[] args) throws IOException {
		
	String line, word = "";    
	int count = 0, maxCount = 0;    
	ArrayList<String> words = new ArrayList<String>();    
	
	   
	
	FileReader file = new FileReader("C:\\Users\\studi\\Documents\\Valencia\\Software Development I\\The Raven.txt");    
	BufferedReader br = new BufferedReader(file);    

	  String line1;
      Map<String, Long> counts = new HashMap<>();
      while ((line1 = br.readLine()) != null) {
          
    	  
          String[] words1 = line1.split("[\\s.;,?:!()\"]+");
          for (String word1 : words1) {
              word1 = word1.trim();
              if (word1.length() > 0) {
                  if (counts.containsKey(word1)) {
                      counts.put(word1, counts.get(word1) + 1);
                  } else {
                      counts.put(word1, 1L);
                  }
              }
          }
      }
      for (Map.Entry<String, Long> entry : counts.entrySet()) {
          System.out.println(entry.getKey() + " : " + entry.getValue());
      }
      br.close();
  }
}
