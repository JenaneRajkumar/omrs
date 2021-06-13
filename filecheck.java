import java.io.BufferedReader;  
import java.io.FileReader;  
import java.util.ArrayList;  
   
public class filecheck{  
      
    public static void main(String[] args) throws Exception {  
        String line, word = "";  
        int count = 0, maxCount = 0;  
        ArrayList<String> words = new ArrayList<String>();  
          
        //Opens file in read mode  
        FileReader file = new FileReader("f.txt");  
        BufferedReader br = new BufferedReader(file);  
          
        //Reads each line  
        while((line = br.readLine()) != null) {  
            String string[] = line.toLowerCase().split("([,.\\s]+)");  
            //Adding all words generated in previous step into words  
            for(String s : string){  
                words.add(s);  
            }  
        } 
        String ch="hi";
          
        //Determine the most repeated word in a file  
        for(int i = 0; i < words.size(); i++){  
            count = 1;  
            //Count each word in the file and store it in variable count  
            for(int j = i+1; j < words.size(); j++){  
                if(words.get(i).equals(ch)){  
                    count++;  
                }   
            }  
           
        }  
          
        System.out.println(count);  
        br.close();  
    }  
}