package assignment3;
import java.io.IOException;
import java.net.InetAddress;

public class pingHost {
    public void ping(String ip) throws IOException {
        InetAddress address=InetAddress.getByName(ip);
        long currentTime = System.currentTimeMillis();
        if(address.isReachable(500000))
        {
            System.out.println("not reachable "+(currentTime/2));
        }
        else
        {
            System.out.println("pinging the website "+currentTime/2);
        }
    }
}
