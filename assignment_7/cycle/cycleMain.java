package assignment_7.cycle;
public class cycleMain {
    public static void main(String[]args)
    {
        cycle[]cr;
        cr=new cycle[4];
        cr[0]=new cycle();
        cr[1]=(cycle) new uniCycle();
        cr[2]=(cycle) new biCycle();//upcasting
        cr[3]=(cycle) new triCycle();
        cr[1].balance();
        cr[2].balance();
        cr[0].balance();
        uniCycle un=(uniCycle) cr[1];
        biCycle bn=(biCycle) cr[2];//downcasting
        triCycle tr=(triCycle) cr[3];
        un.balance();
        bn.balance();
        tr.threeWheels();

    }
}
