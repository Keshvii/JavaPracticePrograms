/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsesseionalpractice.java;
import java.util.*;

public class CollectionTraversingComparator {
    public static void main(String[] args) {
        //ArrayList
//        List<Integer> al = new ArrayList<>();
//        al.add(1);
//        al.add(1,2);
//        al.remove(0);
//
//        System.out.println(al);
        
        //LinkedList
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(5);
//        ll.add(2);
//        ll.add(0, 0);
//
//        //ll.remove(2);//index
//        System.out.println(ll);
//        Collections.sort(ll);
//        System.out.println(ll);
//        
//        //Queue
//        Queue<Integer> q = new LinkedList<>();
//        q.add(22);
////        q.poll();//not ava. return null
////        q.remove();//not ava. return exception
////        q.peek();
//        System.out.println(q);
        Hashtable<Character, Integer> d = new Hashtable<>();



//        //Deque
//        Deque<Integer> d = new LinkedList<>();
//        d.add(22);
//        d.addFirst(2);
//        d.addLast(2);
////        d.removeFirst();d.removeLast();
////        d.remove();
////        d.poll();//not ava. return null
////        d.remove();//not ava. return exception
////        d.peek();
//        System.out.println(d);
//        
//        //Stack
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.pop();
//        System.out.println(s);
        
        
//        HashMap<Character,Integer> hm = new HashMap<>();
//        hm.put('s',2);
//        hm.put('3', 42);
//
//        hm.containsKey('3');
//        hm.containsValue(11);
        //System.out.println(hm.get('s'));
//        
//        for(Map.Entry<Character, Integer> m : hm.entrySet() ){
//            System.out.println(m.getKey()+ "=" + m.getValue());
//        
//        }
//        
        //Iterator
        
//        Iterator it = ll.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        Iterator dt = ll.descendingIterator();
//        while(dt.hasNext()){
//            System.out.println(dt.next());
//        }
//
//        ArrayList<Employee> ale = new ArrayList<>();
//        ale.add(new Employee(1, "Blice"));
//        ale.add(new Employee(2, "Cob"));
//        ale.add(new Employee(2, "Dob"));
//
//        Collections.sort(ale,new cmp());
//
//        for(Employee e : ale){
//            System.out.println(e.id+"=="+e.name);
//        }
        LinkedList<String> linkedList = new LinkedList<>();

//        //LinkedList as a Stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");
        System.out.println(linkedList.indexOf("A"));
        System.out.println(linkedList.indexOf("F"));
//        linkedList.pop();
//        System.out.println(linkedList);
//        System.out.println(linkedList.peek());

//        //LinkedList as a Queue
//        linkedList.offer("A");
//        linkedList.offer("B");
//        linkedList.offer("C");
//        linkedList.offer("D");
//        linkedList.offer("E");
//        linkedList.offer("F");
//        linkedList.poll();
//        System.out.println(linkedList);
//        System.out.println(linkedList.peek());
//
    }
}

class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
class cmp implements Comparator<Employee>{
    
    @Override
    public int compare(Employee e1, Employee e2){
        //return e1.id-e2.id;
        return e1.name.compareTo(e2.name);
    }

}