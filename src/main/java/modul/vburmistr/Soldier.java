package modul.vburmistr;

public class Soldier extends Human{
    private String rank;
    private String gun;
    private Commander commander;

    public Soldier(String name, int age, String rank, String gun) {
        super(name, age);
        this.rank = rank;
        this.gun = gun;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void canFight() {
        System.out.println("I can fight");
    }
    @Override
    public void report() {
        if(commander!=null){
            System.out.println("Im "+ getName() +" in under the orders of the Commander "+commander.getName());
        }else{
            System.out.println("I have no commander");
        }
    }
}
