package modul.vburmistr;

import java.util.ArrayList;
import java.util.List;

public class Commander extends Human{
    private Soldier[] soldiers = new Soldier[3];
    private General general;


    Commander(String name, int age, Soldier[] soldiers ){
        super(name, age);
        if(soldiers!=null&&soldiers.length==3){
            this.soldiers = soldiers;
        }else {
            throw new NotEnoughStaff("Im commander and need 3 soldiers but have :"+soldiers.length);
        }
    }
    public void setGeneral(General general) {
        this.general = general;
    }
    @Override
    public void canFight() {
        System.out.println("I can fight");
    }
    @Override
    public void report() {
        System.out.println("Im "+ getName() +" in under the orders of the General "+general.getName());
    }
}
