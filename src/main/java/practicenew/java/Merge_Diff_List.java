package practicenew.java;

import java.util.LinkedList;

class Pet{
    String name;
    int age;
    Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+" "+age;
    }
}
public class Merge_Diff_List {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        LinkedList<Integer> ages = new LinkedList<>();
        LinkedList<Pet> merged = new LinkedList<>();

        names.add("Jerry");
        names.add("Oreo");
        names.add("Denny");
        names.add("Cookie");

        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);

        Pet p;
        for(int i=0; i<names.size(); i++){
            p = new Pet(names.get(i),ages.get(i));
            merged.add(p);
        }
        System.out.println("Merger List: "+merged);
    }
}