package Items.Clothings;

public class RareBoots extends Clothing {

    public RareBoots(){
        super();
    }

    public RareBoots(String name,double value,double weight,int a){
        super(name, value, weight, a);
        a=17;
    }

    @Override
    public void protection(){
        super.protection();
    }

}
