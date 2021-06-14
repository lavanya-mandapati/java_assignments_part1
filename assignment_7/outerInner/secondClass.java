package assignment_7.outerInner;
public class secondClass {
    public class secondInnerClass extends outerClass.innerClass{
        secondInnerClass(outerClass c1, String str1) {
            c1.super(str1);
        }
    }
}
