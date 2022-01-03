import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int v = 0, l = 0,w = 0;
        try {
            FileReader fr =  new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            while( line != null){
                l++;
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreElements()){
                    String word = st.nextToken();
                    w++;
                    for(int i = 0; i < word.length(); i++){
                        if(word.charAt(i) == 'a' ||
                                word.charAt(i) == 'A'||
                                word.charAt(i) == 'e'||
                                word.charAt(i) == 'E'||
                                word.charAt(i) == 'i'||
                                word.charAt(i) == 'I'||
                                word.charAt(i) == 'o'||
                                word.charAt(i) == 'O'||
                                word.charAt(i) == 'u'||
                                word.charAt(i) == 'U')
                            v++;
                    }
                }
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Total line :"+ l + "\nTotal word:" + w + "\nTotal vowel:" + v);
        
    }
}
