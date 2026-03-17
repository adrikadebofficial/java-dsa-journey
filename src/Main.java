import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(datetimeformat);

        System.out.println("Hello World, Name: Adrika, Date: " + formattedDate );

    }
}