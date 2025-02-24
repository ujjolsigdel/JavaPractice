public class Ex12 {
    public static int checkLottery(int[] correct, int[] guess)
    {
        int correctGuess = 0;

        for (int i = 0; i < correct.length; i++){
            for (int j = 0; j < guess.length; j++){
                if (correct[i] == guess[j]) {
                    correctGuess++;
                }
            }
        }

        return correctGuess;

    }
    public static void main(String[] args) {
        System.out.println( checkLottery((new int[] {1,2,3,4,5,6,7}), new int[] {13,12,11,10,9,8,7}));
    }
}
