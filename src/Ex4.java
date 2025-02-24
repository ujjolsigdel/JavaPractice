public class Ex4 {
    private static void EvenNumberOfLetters(String text)
    {
        System.out.println("text: " + text);


        if(text.length() == 0){
            System.out.println("Empty string!");
        }
        else if(text.length() % 2 == 0) {
            System.out.println("Even number of letters!");
        }
        else{
            System.out.println("Odd number of letters!");
        }
    }

    public static void main(String[] args){
        EvenNumberOfLetters("University of Eastern Finland");
    }
}
