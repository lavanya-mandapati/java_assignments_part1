package assignment6;

public class stringConstructor {
    assignment.stringConstructor[] sc;
    stringConstructor()
    {

        System.out.println("default constructor");
    }
    stringConstructor(String str)
    {
        System.out.println(str);
    }
    public static void main(String[]args)
    {
        stringConstructor[] sc;
        sc=new stringConstructor[2];
        sc[0]=new stringConstructor("hello");
        sc[1]=new stringConstructor();
        //new stringConstructor();
        //new stringConstructor("hello");


    }
}
