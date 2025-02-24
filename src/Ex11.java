public class Ex11 {
    public static void NestedLoop(String s, int upper_limit)
    {
        // Write your code here
        for (int i = 0; i < s.length(); i++) {
            char outerLoopVariable = s.charAt(i);

            for (int j = 0; j <= upper_limit; j++) {
                System.out.println(outerLoopVariable + "-" + j);
            }
        }
    }
    public static void main(String[] args){
        NestedLoop("Moi", 10);
    }
}
