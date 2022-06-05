package Items.Clothings;

public class MediumArmor extends Clothing{

    public MediumArmor(){
        super();
    }

    public MediumArmor(String name,double value,double weight,int a){
        super(name, value, weight, a);
        a=35;
    }

    @Override
    public void protection() {
        super.protection();
    }
}
