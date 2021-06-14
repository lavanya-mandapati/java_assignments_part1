package assignment_7.Interface;
public class implementInterface extends baseClass implements subInterface {
    interface1 in1;
    interface2 in2;
    interface3 in3;
    subInterface si;

    public implementInterface(String str) {
        System.out.println(str);
    }

    @Override
    public void method1_1() {
        System.out.println("method 1 of interface1");
    }

    @Override
    public void method1_2() {
        System.out.println("method 2 of interface1");
    }

    @Override
    public void method2_1() {
        System.out.println("method 1 of interface2");
    }

    @Override
    public void mehtod2_2() {
        System.out.println("method 2 of interface2");
    }

    @Override
    public void method3_1() {
        System.out.println("method 1 of interface3");
    }

    @Override
    public void method3_2() {
        System.out.println("method 2 of interface3");
    }

    @Override
    public void subMethod() {
        System.out.println("sub interface implementation");
    }
    public void method1(implementInterface in1)
    {
        System.out.println("hello");
    }
    public void method2(implementInterface in2)
    {
        System.out.println("hello");
    }
    public void method3(implementInterface in3)
    {
        System.out.println("hello");
    }
    public void method4(subInterface si)
    {
        System.out.println("hello");
    }
}
