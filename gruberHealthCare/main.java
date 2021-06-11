package gruberHealthCare;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class main {
    public static void main(String[]args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        //int number_of_inputs=sc.nextInt();
        gruberHealthCare ghc=new gruberHealthCare();
        //for(int i=0;i<number_of_inputs;i++) {
        String date_s1 = sc.nextLine();
        Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(date_s1);
        String date_s2 = sc.nextLine();
        Date date2 = new SimpleDateFormat("yyyy-mm-dd").parse(date_s2);
        ghc.knowYourCustomerForm(date1,date2,date_s1,date_s2);

        //}

    }
}
