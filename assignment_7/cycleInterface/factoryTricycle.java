package assignment_7.cycleInterface;

public class factoryTricycle implements cycleInterface {
    @Override
    public void cycleFeatures() {
        System.out.println("Advanced features");
    }
    public void production()
    {
        System.out.println("Tricycle production");
    }
}
