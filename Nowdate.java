import java.time.*;
import java.time.format.DateTimeFormatter;
class Nowdate{
    public static void main(String ar[]){
        LocalDate date=LocalDate.now();
        System.out.println(date);
         LocalTime time=LocalTime.now();
        System.out.println(time);
         LocalDateTime datetime=LocalDateTime.now();
         System.out.println(datetime);
        
         DateTimeFormatter FormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String formater=datetime.format(FormatObj);
           System.out.println( formater);


    }
}


