package creationalDP.prototypeDP;

public class Soldier implements Cloneable {
    private int health;
    private int speed;
    private int age;
    private int agility;
    private int power;
    private int rank;
    private String weapon;
    private boolean isAvailableForWar;

    public Soldier(int health, int speed, int age, int agility, int power, int rank, String weapon, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.age = age;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableForWar() {
        return isAvailableForWar;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }

    public void soldierInfo(){
        System.out.println("saglik "+health);
        System.out.println("hiz "+speed);
        System.out.println("age "+agility);
        System.out.println("guc "+power);
        System.out.println("rutbe "+rank);
        System.out.println("silah "+weapon);
        if(isAvailableForWar){
            System.out.println("savasmaya hazir");
        }else System.out.println("hazir degil");

    }


    @Override
    public Soldier clone() {
        Soldier soldier=null;
        try {
            soldier= (Soldier) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original

        } catch (CloneNotSupportedException e) {
            System.out.println("asker kopyalarken hata oldu");
            e.printStackTrace();
        }
        return soldier;
    }
}
