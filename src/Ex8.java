public class Ex8 {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Length of the array: " + numbers.length);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        char[] letters = {'a','b','c','d','e','f','g'};
        System.out.println("Length of the array: " + letters.length);

        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)('a' + i);
            System.out.println(letters[i]);
        }
    }


}
