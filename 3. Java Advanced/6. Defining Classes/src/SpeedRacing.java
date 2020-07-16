public class SpeedRacing {
    String model;
    double fuel;
    double consumption;
    int distance;

    public SpeedRacing(String model, double fuel, double consumption) {
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;
        int distance = 0;
    }

    public boolean drive(int distance) {
        double fuelNeeded = distance * consumption;
        if (fuelNeeded <= this.fuel) {
            this.fuel -= fuelNeeded;
            this.distance += distance;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuel, this.distance);
    }
}










/*
public class SpeedRacing {
    private String model;
    private double fuel;
    private double consumption;
    private int distance;


    public SpeedRacing(String model, double fuel, double consumption) {
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean drive(int distance) {
        double fuelNeeded = distance * consumption;
        if (fuelNeeded <= this.fuel) {
            this.distance += distance;//uvelichava razstoqnieto ot otvun
            this.fuel -= fuelNeeded;//namalqva tekushtoto gorivo v rezervoara
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %d",this.model,this.fuel,this.distance);
    }
}

 */