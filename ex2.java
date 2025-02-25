public class ex2 {
    public static void main(String[] args){

        WeatherStation ws = new WeatherStation(1.5,2.5);
        System.out.println(ws.getTemperature());
        System.out.println(ws.getPressure());
        ws.setTemperature(25.6);
        ws.setPressure(0.5);
        System.out.println(ws.getTemperature());
        System.out.println(ws.getPressure());
    }
}

class WeatherStation
{
    double temperature;
    double pressure;

    public WeatherStation(double temperature, double pressure){
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    public double getPressure(){
        return pressure;
    }
    public void setPressure(double pressure){
        this.pressure = pressure;
    }

}