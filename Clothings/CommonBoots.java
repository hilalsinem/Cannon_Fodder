package Items.Clothings;

public class CommonBoots extends Clothing {

    public CommonBoots(){
        super();
    }

    public CommonBoots(String name, double value, double weight, int a){
        super(name,value,weight,a);
        a=7;
    }

    @Override
    public void protection(){
        super.protection();
    }

}
