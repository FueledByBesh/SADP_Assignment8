package patternsex.observer.system;

import java.util.HashSet;
import java.util.Set;

public class Stock {

    private String symbol;
    private Float price;
    private Set<Investor> investors;


    public Stock(String symbol, Float price){
        this.symbol=symbol;
        this.price=price;
        this.investors = new HashSet<>();
    }

    public void registerInvestor(Investor investor){
        this.investors.add(investor);
    }

    public void unregisterInvestor(Investor investor){
        this.investors.remove(investor);
    }

    public void updatePrice(Float price){
        this.price=price;
        for(Investor investor: investors){
            investor.update(this,price);
        }
    }

    public String getSymbol(){
        return this.symbol;
    }

    public Float getPrice(){
        return this.price;
    }

}
