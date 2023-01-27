package behavioralDP.observeDB;

import java.util.ArrayList;
import java.util.List;

public class NewsChanel implements Chanel{
    List<String> newlist=new ArrayList<>();
    @Override
    public void update(String news) {
    newlist.add(news);
    }

    @Override
    public void print() {
    for(String news : newlist){
        System.out.println(news);
    }
    }
}
