package Items.Clothings;

public class HardArmor extends Clothing{

    public HardArmor(){
        super();
    }

    public HardArmor(int a,double value,double weight,String name){
        super(name,value,weight,a);
        a=55;
    }

    @Override
    public void protection(){
        super.protection();
    }
}
