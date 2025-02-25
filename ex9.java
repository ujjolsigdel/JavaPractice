public class ex9 {
    public static void main(String[] args){

        StackOfRectangles sor = new StackOfRectangles();
        System.out.println(sor.isEmpty());
        sor.push(new Rectangle(10,10));
        sor.push(new Rectangle(0,0));
        sor.push(new Rectangle(5,5));
        System.out.println(sor.getTotalArea());
        System.out.println(sor.getSize());
        System.out.println(sor.isEmpty());
        Rectangle rrr = sor.pop();
        System.out.println(rrr.getDiagonal());
        rrr = sor.peek();
        System.out.println(rrr.getArea());
        System.out.println(sor.getTotalArea());
        sor.pop();
        System.out.println(sor.getTotalArea());
        sor.pop();
        System.out.println(sor.getTotalArea());
        System.out.println(sor.isEmpty());
        System.out.println(sor.getSize());
    }
}
class StackOfRectangles {
    private Rectangle[] elements;
    private int size;

    public StackOfRectangles(int size) {
        elements = new Rectangle[size];
    }
    public StackOfRectangles() {
        elements = new Rectangle[25];
    }
    public void push(Rectangle r) {
        if (this.size >= elements.length){
            Rectangle[] new1 = new Rectangle[elements.length + 20];
            System.arraycopy(elements,0,new1,0,elements.length);
            this.elements=new1;
        }
        elements[size++]=r;
    }

    public boolean isEmpty(){
        return size==0?true:false;
    }
    public Rectangle peek(){
        return elements[size-1];
    }
    public Rectangle pop(){
        return elements[--size];
    }
    public int getSize(){
        return size;
    }
    public double getTotalArea(){
        double a=0;
        for(int i=0;i<size;i++){
            a+=elements[i].getArea();

        }
        return a;
    }



}




// Class Rectangle is given below
// Do not touch this code

class Rectangle
{
    private double height;
    private double width;

    public Rectangle(double hei, double wid){
        height = hei; width = wid;
    }
    public double getArea(){
        return width * height;
    }
    public double getDiagonal(){
        double diag = Math.sqrt( (height*height) + (width*width) );
        return diag;
    }
}

