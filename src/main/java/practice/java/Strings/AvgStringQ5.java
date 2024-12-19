/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java.Strings;

import java.util.StringTokenizer;

public class AvgStringQ5 {

    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";

        StringTokenizer st = new StringTokenizer(str," ");
        int wordCount = st.countTokens();
        System.out.println(wordCount);
        int avLen = str.length()/wordCount;
        System.out.println(avLen);
        StringBuffer sb1 = new StringBuffer(); //<=av
        StringBuffer sb2 = new StringBuffer(); //>av

        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.length()<=avLen){
                sb1.append(word+" ");
            }else{
                sb2.append(word+" ");
            }

        }
        System.out.println(sb1);
        System.out.println(sb2);

    }
    
}
