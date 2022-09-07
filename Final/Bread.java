import java.util.Date;

public class Bread extends Product{
    private Size size;
    private Date expDate;
    static public int amountBread;

    Bread(){
        super();
        amountBread++;
    }
    Bread(String productCode , double price , Date expDate ,Size size){
        super(productCode , price);
        this.size = size;
        this.expDate  = expDate;
        amountBread++;
    }
    
    public Size getSize() {
        return size;
    }
    public Date getExpDate() {
        return expDate;
    }
    
    public int getAmountBread() {
        return amountBread;
    }
    @Override
    public String toString() {
        return super.toString() + "Bread [size=" + size + "]";
    }
    
}
enum Size{
    S,M,L
}