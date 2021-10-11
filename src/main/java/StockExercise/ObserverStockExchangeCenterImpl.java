package StockExercise;

import StockExercise.Given.ObservableStock;
import StockExercise.Given.ObserverStockExchangeCenter;
import StockExercise.Given.StockType;

import java.sql.SQLOutput;

public class ObserverStockExchangeCenterImpl extends ObserverStockExchangeCenter {
    public ObserverStockExchangeCenterImpl() {
        super();
    }

    public void notifyChange(StockType type, double price){
        this.ownedStock.put(type, price);
    }

    //@TODO: Override any necessary methods

    @Override
    public void buyStock(ObservableStock s) {
        super.buyStock(s);
        this.observe(s);
    }

    public void observe(ObservableStock o){
        //@TODO: Implement me
        o.registerStockExchangeCenter(this);
    }


}
