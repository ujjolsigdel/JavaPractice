public class Ex9 {
    public static void Loops(int forLoopMaxIterations, int whileLoopMaxIterations)
    {
        for(int i = 0; i < forLoopMaxIterations; i++){
            System.out.println("For loop: " + i);
        }

        int j = 0;
        while(j < whileLoopMaxIterations){
            System.out.println("While loop: " + j);
            j++;

        }

    }
    public static void main(String[] args){
        Loops(4, 8);
    }

}
