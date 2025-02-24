public class Ex3 {
    public static double Average(double x, double y, double z) {
        return (x + y + z) / 3.0;
    }

    private static int Sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args){
        System.out.println(Average(4.2, 5.9, 2.9));
        System.out.println(Sum(4, 8, 9, 6));
    }
}
