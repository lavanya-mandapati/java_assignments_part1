package gruberHealthCare;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class gruberHealthCare {
    public void knowYourCustomerForm(Date data_s1, Date date_s2, String signUpDate, String currentDate) {
        LocalDate date1 = LocalDate.parse(signUpDate);
        LocalDate date2 = LocalDate.parse(currentDate);
        LocalDate date2_1 = LocalDate.parse(currentDate);
        int day = date1.getDayOfMonth();
        int month = date1.getMonthValue();
        int currentYear = date2.getYear();
        int signUpYear = date1.getYear();
        String current = null;
        if (month < 10) {
            current = currentYear + "-0" + month + "-" + day;
        } else {
            current = currentYear + "-" + month + "-" + day;
        }
        if(day<10)
        {
            current = currentYear + "-0" + month + "-0" + day;
        }
        else
        {
            current = currentYear + "-0" + month + "-" + day;
        }
        if (currentYear == signUpYear) {
            System.out.println("No range");
        } else {
            LocalDate date3 = LocalDate.parse(current);
            LocalDate min_value = date3.minusDays(30);
            System.out.println(min_value);
            LocalDate max_value=date3.plusDays(30);
            if(max_value.isAfter(date2_1))
            {
                System.out.println(date2_1);
            }
            else
            {
                System.out.println(max_value);
            }

        }


    }
}
