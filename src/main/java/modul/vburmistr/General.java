package modul.vburmistr;

import java.util.ArrayList;
import java.util.List;

public class General extends Human {
    private Commander[] commanders = new Commander[2];
    private String awardWeapon;
    public General(String name, int age, Commander[] commanders ,String awardWeapon){
        super(name, age);
        this.awardWeapon = awardWeapon;
        if(commanders!=null&&commanders.length==2){
            this.commanders = commanders;
        }else {
            throw new NotEnoughStaff("Im General and need 2 commanders but have :"+commanders.length);
        }
    }
    @Override
    public void canFight() {
        System.out.println("I can fight, but better to safe safe and create some tactics");
    }
    @Override
    public void report() {
        System.out.println("i "+ getName() +" cant report, im highest rank");
    }

}
