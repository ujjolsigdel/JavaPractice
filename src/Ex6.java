public class Ex6 {
    public static int ConvertToInteger(String s)
    {
        try {
            return Integer.parseInt(s);

        }catch (Exception E){
            System.out.println(E);
            return 0;

        }
    }
    public static double ConvertToDouble(String s)
    {
        try {
            return Double.parseDouble(s);

        }catch (Exception E){
            System.out.println(E);
            return 0.0;
        }
    }
    public static void main(String[] args){
        System.out.println(ConvertToInteger("15.69"));
        System.out.println(ConvertToDouble("130"));
    }
}
