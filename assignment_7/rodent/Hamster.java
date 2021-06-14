package assignment_7.rodent;

public class Hamster extends Rodent {
    Hamster()
    {
        System.out.println("Features of hamster");
    }
    @Override
    public void incisors() {
        System.out.println("incisors on upper side only");
    }
}
