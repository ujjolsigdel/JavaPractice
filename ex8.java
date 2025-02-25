public class ex8 {
    public static void main(String[] args) {
        String ssss = "12345-12345!12345-12345!1235d5-123456!asn!66666-55555";
        WeirdChecker wr = new WeirdChecker(ssss);
        wr.printStats();
        System.out.println();
        WeirdChecker wr2 = new WeirdChecker("12345-12345!12345-12345!1235d5-123456!asn!66666-55555!12345-12345!12345-12345!1235d5-123456!asn!66666-55555");
        wr2.printStats();
        System.out.println();
        WeirdChecker wr3 = new WeirdChecker("");
        wr3.printStats();
    }
}
class WeirdChecker {
    private int totalCodes;
    private int passingCodes;

    public WeirdChecker(String codes){
        String[] code = codes.split("!");
        if(code.length > 1) {
            for(int i = 0; i < code.length; i++) {
                totalCodes++;

                if(code[i].matches("\\d{5}-\\d{5}")) {
                    passingCodes++;
                }
            }
        }




    }


    public int getTotalCodes(){
        return totalCodes;
    }
    public int getPassingCodes(){
        return passingCodes;
    }

    public void printStats() {
        System.out.println("Passing:" + passingCodes);
        System.out.println("Total:" + totalCodes);

    }



}


