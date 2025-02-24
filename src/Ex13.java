public class Ex13 {
    public static void RepeatPrintOut(String a, int n)
    {
        for (int i = 0; i < n; i++){
            System.out.println(a);
        }

    }

    public static int GreatestOfFour(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static float Shrink(float initial, float limit, float step) {
        while (initial > limit) {
            initial -= step;
        }
        return initial;
    }
    public static void main(String[] args){
        RepeatPrintOut("apple", 4);
        System.out.println( GreatestOfFour(4, 2, 9, 7));
        System.out.println(Shrink(5, 1, 0.25f));

    }
}
