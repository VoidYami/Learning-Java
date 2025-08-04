import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formmater {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/YYYY--E H:m a");
        // DateTimeFormatter date2 = DateTimeFormatter.BASIC_ISO_DATE;
        String My_date = dt.format(date);
        System.out.println(My_date);
    }
}
