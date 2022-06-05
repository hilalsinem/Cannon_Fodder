import Items.Item;
import Items.Weapons.Wands.BoneWand;
import Items.Weapons.Wands.ElderWand;
import Items.Weapons.Wands.Wand;
import Items.Weapons.Wands.WoodWand;

import java.util.Random;

public class NeededMethods {

    Random rand = new Random();

    //This method for enemy class...
    public void dropItem(){
        int odds = rand.nextInt(100);

        if (odds <= 49){
            System.out.println("No item for you!");
        }else {
            createNewItem();
        }
    }

    //I don't know where can I put this method
    public void createNewItem(){
        int odds = rand.nextInt(100);

        if(odds <= 24){
            createNewCloathing();
        } else if (odds <=49){
            createNewShield();
        }else if (odds <= 74){
            createNewSword();
        }else {
            createNewWand();
        }
    }

    public void createNewWand(){
        Random rand = new Random();
        int odds = rand.nextInt(99);
        if(odds <= 32){
            createBoneWand();
        } else if (odds <= 65){
            createWoodWand();
        }else{
            createElderWand();
        }
    }

    public Wand createBoneWand(){
        Wand newWand = new BoneWand();
        return newWand;
    }

    public Wand createWoodWand(){
        Wand newWand = new WoodWand();
        return newWand;
    }

    public Wand createElderWand(){
        Wand newWand = new ElderWand();
        return newWand;
    }
}
