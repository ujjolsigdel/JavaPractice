public class Ex10 {
    public static void PrintFirst(int[] myArray)
    {
        System.out.println("Printing first element");
        System.out.println(myArray[0]);
    }

    public static void PrintLast(int[] myArray)
    {
        System.out.println("Printing last element");
        System.out.println(myArray[myArray.length - 1]);


    }

    public static void PrintArray(int[] myArray)
    {
        System.out.println("Printing Array");
        for (int i : myArray){
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args){
        PrintFirst(new int[] {1, 2, 3, 4, 5} );
        PrintLast(new int[] {1, 2, 3, 4, 5});
        PrintArray(new int[] {1, 2, 3, 4, 5});

    }
}
