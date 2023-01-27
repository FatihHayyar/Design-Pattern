package creationalDP.singleton;

public class SingletonObject {
    String message="Hallo";
    private static SingletonObject instance=new  SingletonObject();

   private SingletonObject() {};

   public static SingletonObject getInstance() {
       return instance;
   }

   public void changeMessage(){
       this.message=this.message+" A";
   }
}
