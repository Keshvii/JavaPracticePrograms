/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.java.Strings;


public class FreqOfCharInLine {
    public static void main(String[] args) {
        String st = new String("Hello my name is Samissssssssya Zaidi");
        int[] count = new int[26];
        int maxCount=0;
        String sub = "jjbb";
        int k =0;
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<st.length();i++) {
            String sbst = st.substring(i, i + 1);
            if (sb.indexOf(sbst) == -1) {
                sb.append(sbst);
                count[k] = 1;
                k = k + 1;
            } else {
                count[sb.indexOf(sbst)]++;
            }
        }
            System.out.println(sb);
            for(int j=0;j<sb.length();j++){
                System.out.println(sb.charAt(j) +" " + count[j]);

                if (count[j] > maxCount) {
                    maxCount = count[j];
                    sub = sb.substring(j,j+1);
                }
        }
        System.out.println("Letter with highest occurrences: " + sub + " (" + maxCount + " times)");
    }
}
