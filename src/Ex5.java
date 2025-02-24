public class Ex5 {

    public static int Quadrant(int x, int y)
    {
        if ( x == 0 || y == 0){
            return 0;
        }
        else if (x > 0 && y > 0) {
            return 1;
        }
        else if (x < 0 && y > 0) {
            return 2;
        }
        else if (x < 0 && y < 0) {
            return 3;
        }
        else{
            return 4;
        }
    }
    public static void main(String[] args){
        System.out.println(Quadrant(75,-90)) ;
    }

}
