package behavioralDP.Mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{
    Map<String,Aktor> registeredAktorMap = new HashMap<>();
    void register(String topic,Aktor aktor){
        registeredAktorMap.put(topic, aktor);
    }
    @Override
    public void dispatch(String topic, String message) {
       Aktor aktor= registeredAktorMap.get(topic);
       if(aktor==null){
           System.out.println("no actor registered for this topic");
       }
        aktor.receiveMessage(message);
    }
}
