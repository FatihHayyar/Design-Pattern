package creationalDP.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        SingletonObject ob1=SingletonObject.getInstance();
        System.out.println(ob1.message);
        ob1.changeMessage();

        SingletonObject ob2=SingletonObject.getInstance();
        System.out.println(ob2.message);

    }


}
