public class Ex7 {

    public static String howManyYWD(int days){
        int years = days / 365;
        int remainingDaysAfterYears = days % 365;
        int weeks = remainingDaysAfterYears / 7;
        int remainingDays = remainingDaysAfterYears % 7;

        return days + " days equals " + years + " years, " + weeks + " weeks and " + remainingDays + " days.";
    }
    public static void main(String[] args){
        System.out.println(howManyYWD(968));

    }
}
