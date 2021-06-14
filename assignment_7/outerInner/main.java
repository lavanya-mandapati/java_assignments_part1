package assignment_7.outerInner;
public class main {
    public static void main(String[]args)
    {
        outerClass sc=new outerClass();
        secondClass s=new secondClass();
        s.new secondInnerClass(sc,"hello");


    }
}
