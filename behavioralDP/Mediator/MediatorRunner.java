package behavioralDP.Mediator;

public class MediatorRunner {
    public static void main(String[] args) {

        MediatorRunner runner = new MediatorRunner();
        runner.mediatorDemo();


    }

    void mediatorDemo(){
        MessageDispatcher dispatcher =new  MessageDispatcher();
        Aktor aktor1=new MessageAktor("aktor1", dispatcher);
        Aktor aktor2=new MessageAktor("aktor2", dispatcher);
        Aktor aktor3=new MessageAktor("aktor3", dispatcher);
        Aktor aktor4=new MessageAktor("aktor4", dispatcher);

        dispatcher.register("topic1", aktor1);
        dispatcher.register("topic2", aktor2);
        dispatcher.register("topic3", aktor3);
        dispatcher.register("topic4", aktor4);

        aktor1.sendMessage("topic2","topic 2 ");
        aktor1.sendMessage("topic3","topic 3 ");
        aktor1.sendMessage("topic4","topic 4 ");
    }

}
