import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import static java.util.Calendar.*;

public class DataCalendar {

    public static void main(String[] args) {

        // input of data of keyboard
       try (Scanner sc = new Scanner(System.in)){
           int dia = sc.nextInt();
           int mes = sc.nextInt();
           int ano = sc.nextInt();

            // assigning the variables received by the keyboard to the methods of the Calendar class
           Calendar calendar = Calendar.getInstance();
           calendar.set(DATE, dia);
           calendar.set(MONTH, mes -1);
           calendar.set(YEAR,ano);

            //print in console day of week with method day_of_week.
           System.out.println(calendar.getDisplayName(DAY_OF_WEEK, LONG, new Locale("em","US")).toUpperCase());

        }



    }

}
