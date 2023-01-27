package creationalDP.prototypeDP;

public class PrototypeDemo {
    public static void main(String[] args) {
        Soldier soldier=new Soldier(100,70,25,80,75,2,"waffe",true);
        soldier.soldierInfo();
//        Soldier soldier1=new Soldier(100,70,25,80,75,2,"waffe",false);
//        soldier1.soldierInfo();
        System.out.println("--------------------------------");
        Soldier soldier2=soldier.clone();
        soldier2.setAvailableForWar(false);
        soldier2.soldierInfo();
        System.out.println("--------------------------------");

    }
}
