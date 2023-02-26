package Program01;
public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    
    public Stock(String symbol , String name){
        this.symbol=symbol;
        this.name=name;
    }

    public double getChangePercent(){
        double change = ((this.currentPrice-this.previousClosingPrice)/(this.previousClosingPrice))*100;
        return change;
    }
}
