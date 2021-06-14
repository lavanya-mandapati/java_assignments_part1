package assignment_7.Interface;
public class main {
    public static void main(String[] args) {
        implementInterface ip = new implementInterface("hii");
        implementInterface ip1 = new implementInterface("hello");
        ip.method1(ip1);
        ip.method2(ip1);
        ip.method3(ip1);
        ip.method4(ip1);
    }
}
