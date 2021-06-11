package StringImplementation;
import java.util.*;
import java.lang.*;
public class main {
    public static void main(String[] args) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        stringImplementation si=new stringImplementation();
        System.out.println(si.stringAlphabetCount(alphabet,str));
    }
}
