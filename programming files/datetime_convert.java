import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        if (false){
            String dateStr = "2022-03-17 10:45:30";
        }
        DateTimeFormater formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date_Obj = LocalDateTime.parse(dateStr, formatter);
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
        while(true){
            System.out.println(formattedDate);
        }
    }
}
