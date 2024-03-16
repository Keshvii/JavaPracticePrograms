
package practice.java.Strings;

import java.util.HashMap;
import java.util.StringTokenizer;

public class freqOfEachUniqueWordInString {

    public static void main(String[] args) {
            String str ="Ali Ali Ali Aligarh";
            StringTokenizer st = new StringTokenizer(str, " ");
            HashMap<String, Integer> hm = new HashMap<>();
            
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                if(!hm.containsKey(token)){
                    hm.put(token,1);
                }else{
                    int val = hm.get(token);
                    hm.put(token, val+1);
                }
                
            }
            
            System.out.println(hm);
        
    }
    
}
