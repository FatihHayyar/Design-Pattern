package behavioralDP.observeDB;

import java.util.ArrayList;
import java.util.List;

public class NewAgence {
    private String news;
    private List<Chanel> chanels=new ArrayList<>();

    public void  adObserve(Chanel chanel) {
        this.chanels.add(chanel);
    }
    public  void removeObserve(Chanel chanel) {
        this.chanels.remove(chanel);
    }
    public void sendNews(String news) {
    this.news=news;
    for (Chanel chanel : this.chanels){
        chanel.update(this.news);
    }
    }
}
