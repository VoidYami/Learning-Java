import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(55);
        ad1.add(5);
        ad1.add(555);
        ad1.addFirst(59);
        System.out.println(ad1.getFirst());
    }
}
