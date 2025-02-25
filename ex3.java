public class ex3 {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.setSpeed(2);
        f.setRadius(6.0);
        f.setColor("Pink");

        Fan f2 = new Fan();
        f2.setSpeed(2);
        f2.setRadius(6.0);
        f2.setColor("Pink");

        System.out.println(f2.equals(f));
        System.out.println(f.equals(f2));

        f2.setSpeed(3);
        System.out.println(f.equals(f2));

        System.out.println();

        Fan f3 = new Fan();
        f3.setSpeed(2);
        f3.setRadius(6.0);
        f3.setColor("Pink");

        Fan f4 = new Fan();
        f4.setSpeed(2);
        f4.setRadius(6.0);
        f4.setColor("Pink");

        System.out.println(f4.fastest(f3));
        System.out.println(f3.fastest(f4));

        f4.setSpeed(3);
        System.out.println(f3.fastest(f4));
        f4.setSpeed(1);
        System.out.println(f3.fastest(f4));
        f3.setSpeed(1);
        System.out.println(f3.fastest(f4));
    }
}
class Fan
{
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = 1; on=false; radius=5; color="Blue";
    }

    public int getSpeed() {return speed;}
    public double getRadius() {return radius;}
    public String getColor() {return color;}

    public void setSpeed(int sp) { if (sp >= 1 && sp <=3) speed = sp;}
    public void setRadius(double rd) {radius = rd;}
    public void setColor(String ss) {color = ss;}

    public void turnOn() {on = true;}
    public void turnOff() {on = false;}
    public void increaseSpeed() {
        if (speed < 3)
            speed += 1;
        else
            System.out.println("Fan is already running at highest speed.");
    }

    public void decreaseSpeed() {
        if (speed > 1)
            speed -= 1;
        else
            System.out.println("Fan is already running at lowest speed.");
    }

    public String toString() {
        String s = "";
        if (on == true){
            s += "Speed:";
            if (speed == 1)
                s+="Slow ";
            else if (speed == 2)
                s+="Medium ";
            else
                s+="Fast ";
        }
        s+="Color:"+color+" Radius:"+radius;

        if (on == false)
            s+=" (fan is off)";
        return s;
    }
    public boolean equals(Fan f) {
        if (f == null) {
            return false;
        }
        return this.speed == f.getSpeed() &&
                this.radius == f.getRadius() &&
                this.color.equals(f.getColor());

    }
    public String fastest(Fan f) {
        if (this.speed > f.getSpeed()){
            return speedToString(this.speed);
        }
        else if (this.speed < f.getSpeed()) {
            return speedToString(f.getSpeed());
        }
        else {
            return speedToString(this.speed);
        }
    }
    public String speedToString(int speed) {
        switch(speed) {
            case 1:
                return "Slow";
            case 2:
                return "Medium";
            case 3:
                return "Fast";
            default:
                return "Invalid Speed";
        }
    }
}