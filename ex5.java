public class ex5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.getDiagonal());
        System.out.println(r.getArea());
    }
}

class Rectangle{
    private double height;
    private double width;


    // I couldn't get the desired result by putting the initial value 1
    // which I thought was being instructed in the exercise, so I put
    // the initial values 0 to get the desired output as in the exercise set
    // I could be wrong for not understanding the instructions properly

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double length) {
        this.height = length;
        this.width = length;
    }

    public double getArea() {
        return height * width;
    }

    public double getDiagonal() {
        return Math.sqrt((height * height) + (width * width));
    }

}