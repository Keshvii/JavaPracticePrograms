package beta;

import java.util.HashMap;
import java.util.Map;

public class UniqueCityMaxOccurance_27 {

    static void ques27(String[] str){
        Map<String,Integer> hm = new HashMap<>();
        int maxOcc=0;String maxCity="";
        for (String s: str){
//            if(!hm.containsKey(s)){
//                hm.put(s,0);
//            }else{
//                int l = hm.get(s)+1;
//                hm.put(s,l);
//            }
            hm.compute(s, (key, oldValue) -> (oldValue == null) ? 1 : oldValue + 1);
            if(hm.get(s)>maxOcc){
                maxOcc = hm.get(s);
                maxCity = s;
            }

        }

        System.out.println("Unique Cities: "+hm.size());
        System.out.println("Max Occ City is "+maxCity+ " Occ: "+maxOcc);



    }


    public static void main(String[] args) {
        String[] s = {"New York", "Paris", "New York", "Paris", "London", "New York", "Tokyo", "Tokyo"};
        ques27(s);

    }
}
