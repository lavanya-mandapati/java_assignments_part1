package assignment6;

import java.util.ArrayList;

public class vampire {
    static int count=0;
    public static ArrayList listNumbers(String str, String ans, ArrayList vam1) {
        if (str.length() == 0) {
            vam1.add(Integer.parseInt(ans));
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String sub = str.substring(0, i) + str.substring(i + 1);
            listNumbers(sub, ans + ch,vam1);
        }
        return vam1;
    }

    public static void main(String[]args)throws NumberFormatException {
        int start=1260;
        String str1=String.valueOf(1260);
        int n=1;
        while (n<=100) {
            ArrayList<Integer>vam1=new ArrayList<>();
            if(str1.length()%2!=0)
            {
                continue;
            }
            ArrayList<Integer>vam=listNumbers(str1,"",vam1);
            for (int i = 0; i < vam.size(); i++) {
                int number1 = 0, number2 = 0, multiply = 1;
                String str2 = String.valueOf(vam.get(i));
                String ans1 = str2.substring(0, (str2.length() / 2));
                String ans2 = str2.substring(str2.length() / 2, str2.length());
                number1 = Integer.parseInt(ans1);
                number2 = Integer.parseInt(ans2);
                if(number1%10==0 && number2%10==0) {
                    continue;
                }
                multiply = (number1 * number2);
                int num = Integer.parseInt(str1);
                if (multiply == (num)) {
                    n=n+1;
                    System.out.println(num);
                    break;
                }
            }
            start=start+1;
            str1=String.valueOf(start);
        }

    }
}
