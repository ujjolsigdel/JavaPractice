public class ex10 {
    public static void main(String[] args){
        MyPoint mp  = new MyPoint(7.0,4.0,"Karelia UAS");
        MyPoint mp2 = new MyPoint(18.0,16.0,"UEF Science Park");
        System.out.println(mp.toString());
        System.out.println(mp2.toString());
        System.out.println("Distance:"+mp.distance(mp2));
    }
}
class MyPoint {

    private double x;
    private double y;
    private String locationName;

    MyPoint(double x, double y, String locationName){
        this.x=x;
        this.y=y;
        this.locationName=locationName;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public String toString(){
        return locationName+"("+x+","+y+")";
    }

    public double distance(MyPoint p){
        double z=Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
        return z;
    }

}