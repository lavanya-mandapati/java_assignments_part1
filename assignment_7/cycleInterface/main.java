package assignment_7.cycleInterface;

public class main {
    public static void main(String[]args)
    {
        factoryUnicycle un=new factoryUnicycle();
        factoryBicycle bc=new factoryBicycle();
        factoryTricycle tc=new factoryTricycle();
        un.cycleFeatures();
        un.produces();
        bc.cycleFeatures();
        bc.production();
        tc.cycleFeatures();
        tc.production();
        uniCycle un_c=new uniCycle();
        biCycle bn_c=new biCycle();
        triCycle t_c= new triCycle();
        un_c.cycleModel();
        bn_c.cycleModel();
        t_c.cycleModel();


    }
}
