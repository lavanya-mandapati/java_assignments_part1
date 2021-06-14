package assignment_7.rodent;

public class Gerbil extends Rodent {
    Gerbil()
    {
        System.out.println("Features of gerbil");
    }
    @Override
    public void incisors() {
        System.out.println("incisors on lower side only");
    }
}
