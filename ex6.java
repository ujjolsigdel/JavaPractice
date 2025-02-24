public class ex6 {
    public static void main(String[] args) {
        Fan f = new Fan();
        System.out.println(f.getSpeed());
        System.out.println(f.getRadius());
        System.out.println(f.getColor());
        f.setSpeed(2);
        f.setRadius(6.0);
        f.setColor("Pink");
        System.out.println(f.getSpeed());
        System.out.println(f.getRadius());
        System.out.println(f.getColor());
        System.out.println();


        Fan f1 = new Fan();
        f1.increaseSpeed();
        f1.increaseSpeed();
        f1.increaseSpeed();
        System.out.println(f1.getSpeed());
        f1.setSpeed(1);
        f1.decreaseSpeed();
        System.out.println(f1.getSpeed());
        System.out.println();

        Fan f2 = new Fan();
        System.out.println(f2.toString());
        f2.setSpeed(2);
        f2.setRadius(6.0);
        f2.setColor("Pink");
        System.out.println(f2.toString());
        f2.turnOn();
        System.out.println(f2.toString());
        f2.increaseSpeed();
        System.out.println(f2.toString());
        f2.turnOff();
        f2.setColor("Black");
        System.out.println(f2.toString());
    }
}


class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed(){
        return speed;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 3) {
            this.speed = speed;
        }
        else {
            System.out.println("Speed must be between 1 and 3.");
        }
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5.0;
        this.color = "Blue";
    }

    public boolean turnOn(){
        this.on = true;
        return this.on;
    }
    public boolean turnOff(){
        this.on = false;
        return this.on;
    }

    public void increaseSpeed(){
        if(speed < 3){
            speed ++;
        }
        else{
            System.out.println("Fan is already running at highest speed.");
        }
    }

    public void decreaseSpeed(){
        if(speed > 1){
            speed --;
        }
        else{
            System.out.println("Fan is already running at lowest speed.");
        }
    }

    public String toString(){
        if(on && speed==1){
            return "Speed:Slow"+" Color:"+color+" Radius:"+radius;
        }
        else if(on && speed==2){
            return "Speed:Medium"+" Color:"+color+" Radius:"+radius;
        }
        else if(on && speed==3){
            return "Speed:Fast"+" Color:"+color+" Radius:"+radius;
        }
        else {
            return "Color:" + color + " Radius:" + radius + " (fan is off)";
        }


    }
}
