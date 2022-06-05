package Items.Clothings;

public class UniqueBoots extends Clothing {

    public UniqueBoots(){
        super();
    }

    public UniqueBoots(String name,double value,double weight,int a){
        super(name, value, weight, a);
        a=30;
    }

    @Override
    public void protection(){
        super.protection();
    }

}
