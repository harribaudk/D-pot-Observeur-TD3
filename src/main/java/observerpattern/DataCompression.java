package observerpattern;


import observerpattern.DataCompressionStrategy;

import java.util.ArrayList;
import java.util.List;

public class DataCompression {

    private DataCompressionStrategy strategy;

    private List<ObserverPattern.DataObserver> observer = new ArrayList<>();


    public DataCompression(){
    }


    public String processData(Data data) {
        String res =  this.strategy.compressData(data);
        for(ObserverPattern.DataObserver ob : observer){
            ob.update(res);
        }
        return res;
    }

    public void setStrategy(DataCompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void addDataObserver(ObserverPattern.DataObserver observer){
        this.observer.add(observer);
    }


}