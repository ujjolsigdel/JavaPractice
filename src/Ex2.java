public class Ex2 {
    // the keyword void means that the method does not have a return value
    public static void PrintWithLineBreak(String a, String b)
    {
        System.out.println(a);
        System.out.println(b);

    }

    public static void PrintWithoutLineBreak(String a, String b)
    {
        System.out.print(a);
        System.out.print(b);


    }
    public static void main(String[] args){
        PrintWithLineBreak("Hello","World");
        PrintWithoutLineBreak("Hello","World");
    }

}
