package JavaSess1Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//
//class CharCounter{
//    private char c;
//    private int i;
//
//    public int getI() {
//        return i;
//    }
//    
//    
//    
//    public boolean hasChar(ArrayList<CharCounter> l,char ch){
//        for (CharCounter l1 : l) {
//            if(l1.c==ch){
//                return true;
//            }
//        }
//        
//        return false;
//    }
//}
//



public class MaxOccCharWordFile {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("sometext.txt"))){
            String line;

            HashMap<Character, Integer> tmc = new HashMap<>();
            HashMap<String,Integer> tmw = new HashMap<>();
            while((line = br.readLine())!= null){


                char[] c = line.toCharArray();
                String[] s = line.split(" ");
                for(int i=0; i<c.length ; i++){
                    
                    
                    if(!tmc.containsKey(c[i])){
                        tmc.put(c[i],1);

                    }else{
                        tmc.put(c[i],tmc.get(c[i])+1);
                    }
                }

                for(int i=0; i<s.length; i++){

                    if(!tmw.containsKey(s[i])){
                        tmw.put(s[i],1);
                    }else{
                        tmw.put(s[i],tmw.get(s[i])+1);
                    }

                }

            }


            int maxWord=0;String maxkey="";
            for(Map.Entry<String,Integer> mm : tmw.entrySet()){
                if(mm.getValue()>maxWord){
                    maxWord = mm.getValue();
                    maxkey = mm.getKey();
                }
            }
            System.out.println(tmw);
            System.out.println(maxkey + "=" + maxWord);


            System.out.println(tmc);

            ArrayList<Map.Entry<Character, Integer>> tmcList = new ArrayList<>(tmc.entrySet());
            Collections.sort(tmcList, new comp());


            //List<Map.Entry<Character, Integer>> tmcList = new ArrayList<>();
            //tmcList.addAll(tmc.entrySet());

            for (Map.Entry<Character, Integer> entry : tmcList) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                break;
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}

class comp implements Comparator<Map.Entry<Character, Integer>>{
    @Override
    public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
        return  m2.getValue() - m1.getValue();
    }
}