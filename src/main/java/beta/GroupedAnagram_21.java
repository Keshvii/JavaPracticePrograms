package beta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedAnagram_21 {
    static List<List<String>> groupedAnagram(String[] str){
        if(str == null || str.length == 0){
            return new ArrayList<>();
        }
        Map<String,List<String>> hm = new HashMap<>();
        for(String s: str){

            char[] count = new char[26];
            for (char c: s.toCharArray()) {
                count[c-'a']++;
            }
            String key = new String(count);

            List<String> ls = hm.getOrDefault(key,new ArrayList<>());
            ls.add(s);
            hm.put(key,ls);

        }

        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupedAnagram(str));
    }

}
