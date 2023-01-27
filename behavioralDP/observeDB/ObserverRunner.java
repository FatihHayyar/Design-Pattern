package behavioralDP.observeDB;

import java.util.Observer;

public class ObserverRunner {
    public static void main(String[] args) {
        ObserverRunner runner = new ObserverRunner();
        runner.observer();

    }
    void observer(){
        Chanel chanel=new NewsChanel();
        Chanel chanel1=new NewsChanel();
        Chanel chanel2=new NewsChanel();

        NewAgence agency=new NewAgence();
        agency.adObserve(chanel);
        agency.adObserve(chanel1);
        agency.adObserve(chanel2);

        agency.sendNews("Java artik kolay");
        agency.sendNews("Sql de kolay");
        agency.sendNews("Springboot security hala zor");

        chanel.print();

    }

}
