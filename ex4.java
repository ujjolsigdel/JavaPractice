public class ex4 {
    public static void main(String[] args) {
//        Stock s0 = new Stock("AA","Nokia",100,50);
//        System.out.println(s0.getChange());
//        System.out.println();


        Stock s = new Stock("BB","Perry",10.10,5.5);
        System.out.println(s.getChange());
        System.out.println(s.getNoS());
        Stock s2 = new Stock("CC","Banana Oy",101.10,15.5);
        System.out.println(s.getNoS());
        Stock s3 = new Stock("DD-3","Abc Oy",553,155);
        System.out.println(s3.getNoS());
        System.out.println(s.getNoS());
    }
}

class Stock{
    private String symbol;
    private String name;
    private double previousPrice;
    private double currentPrice;

    private static int numberOfStocks = 0;


    public Stock(String symbol, String name, double previousPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousPrice = previousPrice;
        this.currentPrice = currentPrice;

        numberOfStocks++;
    }

    public double getChange(){
        return previousPrice - currentPrice;
    }
    public int getNoS(){
        return numberOfStocks;
    }

}