package Items.Clothings;

public class LightArmor extends Clothing {

    public LightArmor(){
        super();
    }

    public LightArmor(String name,double value,double weight,int a){
        super(name,value,weight,a);
        a=15;
    }

    @Override
    public void protection(){
        super.protection();
    }

}
