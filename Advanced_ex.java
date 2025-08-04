import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Advanced_ex {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // // int students = sc.nextInt();
        // ArrayList<String> students = new ArrayList<>(10);

        // students.add("adi");
        // students.add("dark");
        // students.add("monu");
        // students.add("pinky");
        // students.add("sony");
        // students.add("holaa");
        // students.add("nami");
        // students.add("robin");
        // students.add("popo");


        // for (String st : students) {
        //     System.out.println(st);

        //     HashSet<Integer> dt = new HashSet();
        //     nm.add(55);
        //     nm.add(5);
        //     nm.add(6);
        //     nm.add(90);
        //     nm.add(48);
        //     nm.add(55);
        //     System.out.println(nm);
            
        // }
        
        LocalDateTime tt = LocalDateTime.now();

        DateTimeFormatter Date = DateTimeFormatter.ofPattern("H : m : s");
        String My_date = tt.format(Date);
        System.out.println(My_date);

        Date dt = new Date();
        System.out.println(dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());

        Calendar ca = Calendar.getInstance();
        // System.out.println(ca.get(Calendar.HOUR)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND));
        System.out.println(ca.get(Calendar.HOUR_OF_DAY)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND));



    }
}
