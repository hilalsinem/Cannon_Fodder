package Items.Clothings;

public class WizardCloak extends Clothing{

    public WizardCloak() {
        super();
    }

    public WizardCloak(String name,double value,double weight,int a){
        super(name,value,weight,a);
        a=18;
    }

    @Override
    public void protection(){
        super.protection();
    }
}
