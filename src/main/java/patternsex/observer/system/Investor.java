package patternsex.observer.system;


public class Investor {

    private String name;

    public Investor(String name){
        this.name=name;
    }

    public void update(Stock stock,Float price){
        System.out.println(name+": Stock "+stock.getSymbol()+" changed price to "+price+"$");
    }

    public String getName(){
        return this.name;
    }
}
