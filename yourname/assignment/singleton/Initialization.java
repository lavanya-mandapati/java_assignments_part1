package yourname.assignment.singleton;

public class Initialization {
    Initialization in;
    String var1=null;
    public static Object stringInitialize(String var1,Object in)
    {
        var1="hello";//variable value is not visible outside.
        return in;
    }
    public void printString()
    {
        System.out.println(var1);
    }
}
