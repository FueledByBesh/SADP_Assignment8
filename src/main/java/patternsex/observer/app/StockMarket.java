package patternsex.observer.app;

import patternsex.observer.system.*;

public class StockMarket {
    public static void main(String[] args) {

        Investor investor1 = new Investor("Olzhas");
        Investor investor2 = new Investor("Nurbol");
        Investor investor3 = new Investor("Sultan");
        Investor investor4 = new Investor("Roman");
        Investor investor5 = new Investor("Abylai");

        Stock stock1 = new Stock("AAPL",183.36f);
        Stock stock2 = new Stock("GOOG",169.01f);
        Stock stock3 = new Stock("AMZN",186.24f);
        Stock stock4 = new Stock("TSLA",181.14f);
        Stock stock5 = new Stock("MSFT",406.66f);


        stock1.registerInvestor(investor1);
        stock1.registerInvestor(investor2);
        stock1.registerInvestor(investor3);

        stock2.registerInvestor(investor5);
        stock2.registerInvestor(investor1);

        stock3.registerInvestor(investor4);
        stock3.registerInvestor(investor2);
        stock3.registerInvestor(investor1);

        stock4.registerInvestor(investor3);
        stock4.registerInvestor(investor4);

        stock5.registerInvestor(investor1);
        stock5.registerInvestor(investor2);
        stock5.registerInvestor(investor3);
        stock5.registerInvestor(investor4);
        stock5.registerInvestor(investor5);


        stock5.updatePrice(400.77f);

        stock3.updatePrice(190.80f);

    }
}
