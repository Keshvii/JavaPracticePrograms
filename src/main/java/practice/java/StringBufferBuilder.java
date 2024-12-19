/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringBufferBuilder {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();
        StringBuilder sbd = new StringBuilder();

        System.out.println("sbf Length:"+sbf.length()+"-- Capacity:"+sbf.capacity()); // initial 0,16
        System.out.println("sbd Length:"+sbd.length()+"-- Capacity:"+sbd.capacity()); // initial 0,16

        sbf.append("Hello");
        sbd.append("Hello");

        System.out.println("sbf Length:"+sbf.length()+"-- Capacity:"+sbf.capacity()); // 5,16
        System.out.println("sbd Length:"+sbd.length()+"-- Capacity:"+sbd.capacity()); // 5,16

        //sb : "Hello"
        sbf.append("WorldHelloWorld");
        sbd.append("WorldHelloWorld");
        //sb : "HelloWorldHelloWorld" \\New Capacity = (Current Capacity * 2) + 2 = (16*2)+2
        System.out.println("sbf Length:"+sbf.length()+"-- Capacity:"+sbf.capacity()); // 20, 34
        System.out.println("sbd Length:"+sbd.length()+"-- Capacity:"+sbd.capacity()); // 20, 34

        StringBuffer sbf1 = new StringBuffer("Hello");
        StringBuilder sbd1 = new StringBuilder("Hello");

        System.out.println("sbf Length:"+sbf1.length()+"-- Capacity:"+sbf1.capacity()); // initial 5,21(5+16)
        System.out.println("sbd Length:"+sbd1.length()+"-- Capacity:"+sbd1.capacity()); // initial 5,21

        //StringBuilder sb = new StringBuilder(50);  // Initial capacity is 50

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");  // "Hello World"

        sb.insert(5, " World");  // "Hello World"

        sb.replace(6, 11, "Javacc");  // "Hello Java"

        sb.delete(5, 11);

        sb.reverse();

        char c = sb.charAt(1);

        int len = sb.length();

        int cap = sb.capacity();

        String sub1 = sb.substring(6);
        String sub2 = sb.substring(0, 5);


        StringTokenizer st = new StringTokenizer("hi,hello ,bye");
        while (st.hasMoreTokens()){
            System.out.print(st.nextToken()+"-");
        }

        st = new StringTokenizer("hi,hello,bye", ",");
        while (st.hasMoreTokens()){
            System.out.print(st.nextToken()+" ");
        }

        st = new StringTokenizer("hi,hello,bye", ",", true);
        while (st.hasMoreTokens()){
            System.out.print(st.nextToken()+" ");
        }

    }
    
}
