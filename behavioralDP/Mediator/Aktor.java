package behavioralDP.Mediator;

public interface Aktor {
    void receiveMessage(String message);
    void sendMessage(String topic, String message);
}
