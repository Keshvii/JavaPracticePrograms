
package practice.java.Strings;

//import java.util.StringTokenizer;

public class concatStringElementsAndAvgIntElementsOfMainString {
    public static void main(String[] args) {
        String str = "Aligarh Muslim University was established in 0875.";
        String s2 = str.replaceAll(" ","");
        StringBuffer sn = new StringBuffer();
        int sum = 0;
        String[] s = s2.split("");
        int count = 0;
        for(String s1: s){
            
            try{
                
                int k = Integer.parseInt(s1);
                sum += k; 
                count++;
            }catch(NumberFormatException e){
                sn.append(s1);
            }
            
        }
        
        System.out.println("Text:"+sn);
      
        System.out.println("Avg: " + (double)(sum/count));
    }
    
}
