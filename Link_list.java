// import java.util.ArrayList;

import java.util.LinkedList;

public class Link_list {
    public static void main(String[] args) {

        LinkedList<Integer>l1 = new LinkedList<>();
        LinkedList<Integer>l2 = new LinkedList<>();
        
        
        l1.add(2);
        l1.add(8);
        l2.add(45);
        l2.add(29);
        l2.add(27);
        l1.add(10);
        l1.add(0,6);
        l2.add(0,69);

        System.out.println(l1.contains(29));
        l1.set(0,369);
        
        l2.addFirst(5555);
        l1.addLast(55);
        l1.addAll(l2);

        System.out.println(l2);

        for(int i = 0;i <=l1.size(); i++){
            System.out.print(", ");
            System.out.print(l1.get(i));


        }
    }
}
