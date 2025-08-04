import java.util.*;

public class date_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println(Long.MAX_VALUE/1000/3600/24/366);

        Date d = new Date();
        System.out.println(d);
    }
}
