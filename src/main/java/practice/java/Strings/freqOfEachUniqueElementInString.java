
package practice.java.Strings;

import java.util.HashMap;

public class freqOfEachUniqueElementInString {

    public static void main(String[] args) {
        String str = "Aligarh Muslim University was established in 1875.";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else{
                int val = hm.get(str.charAt(i));
                hm.put(str.charAt(i), val+1);
            }
        
        }
        System.out.println(hm);
        
    }
    
}
