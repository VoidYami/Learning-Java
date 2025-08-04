import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>(10);
        l1.add(2);
        l1.add(8);
        l2.add(45);
        l2.add(29);
        l2.add(27);
        l1.add(10);
        // l1.add(0,6);
        // l2.add(0,69);
        l1.addAll(l2);
        l1.addLast(5);
        l2.addFirst(8888);

        System.out.println(l1.contains(29));
        l1.set(0,369);
        // l1.removeAll(l2);
        // l1.removeRange(5, 6);
        l1.trimToSize();
        // l1.retainAll(l2);
        System.out.println(l1);

        for(int i = 0;i <=l1.size(); i++){
            System.out.println(l1.get(i));


        }
       
    }
}
