package assignment_7.rodent;
public class rodentMain {
    public static void main(String[]args) {
        Rodent[] cr;
        cr = new Rodent[4];
        cr[0] = new Rodent();
        cr[0].incisors();
        cr[1] = new Mouse();
        cr[1].incisors();
        cr[2] = new Gerbil();
        cr[2].incisors();
        cr[3] = new Hamster();
        cr[3].incisors();
    }
}
