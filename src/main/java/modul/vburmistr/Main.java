package modul.vburmistr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Soldier[] hQSoldiers = new Soldier[6];
        hQSoldiers[0] = new Soldier("Vova",22,"sergeant","M4");
        hQSoldiers[1] = new Soldier("Serjii",23,"common soldier","M4");
        hQSoldiers[2] = new Soldier("Vitalii",21,"common soldier","M4");
        hQSoldiers[3] = new Soldier("Oleg",20,"common soldier","M4");
        hQSoldiers[4] = new Soldier("Andrii",22,"common soldier","M4");
        hQSoldiers[5] = new Soldier("Linda",21,"common soldier","M4");
        Commander[] headquarterCommanders = new Commander[2];
        headquarterCommanders[0] = new Commander("Joseph",22,new Soldier[]{ hQSoldiers[0],hQSoldiers[1],hQSoldiers[2]});
        headquarterCommanders[1] = new Commander("Serjii",23,new Soldier[]{ hQSoldiers[3],hQSoldiers[4],hQSoldiers[5]});
        General[] headquarterGenerals = new General[2];
        headquarterGenerals[0] = new General("Duda",22,headquarterCommanders,"M4");
        hQSoldiers[0].setCommander(headquarterCommanders[0]);
        hQSoldiers[1].setCommander(headquarterCommanders[0]);
        hQSoldiers[2].setCommander(headquarterCommanders[0]);
        hQSoldiers[3].setCommander(headquarterCommanders[1]);
        hQSoldiers[4].setCommander(headquarterCommanders[1]);
        hQSoldiers[5].setCommander(headquarterCommanders[1]);
        headquarterCommanders[0].setGeneral(headquarterGenerals[0]);
        headquarterCommanders[1].setGeneral(headquarterGenerals[0]);

        Fightable[] headquarter = new Fightable[9];
        headquarter[0] = hQSoldiers[0];
        headquarter[1] = hQSoldiers[1];
        headquarter[2] = hQSoldiers[2];
        headquarter[3] = hQSoldiers[3];
        headquarter[4] = hQSoldiers[4];
        headquarter[5] = hQSoldiers[5];
        headquarter[6] = headquarterCommanders[0];
        headquarter[7] = headquarterCommanders[1];
        headquarter[8] = headquarterGenerals[0];

        Arrays.stream(headquarter).forEach(s->{
            s.canFight();
            s.report();
        });

    }
}
