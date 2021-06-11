package yourname.assignment.main;
import yourname.assignment.data.defaultInitialization;
import yourname.assignment.singleton.Initialization;
public class mainInitialization {
    public static void obj()
    {
        Initialization mi=new Initialization();
        Initialization.stringInitialize("hi",new Initialization());
        mi.printString();
    }
    public static void main(String[]args)
    {
        defaultInitialization df=new defaultInitialization();
        df.print();
        df.printLocal();
        mainInitialization.obj();
    }
    }
