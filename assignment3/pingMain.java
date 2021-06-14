package assignment3;
import java.io.IOException;
import java.util.Scanner;

public class pingMain {
    public static void main(String[]args) throws IOException {
        String ipAddress;
        Scanner sc=new Scanner(System.in);
        ipAddress=sc.nextLine();
        pingHost pingHost_ob=new pingHost();
        pingHost_ob.ping(ipAddress);
    }
}
