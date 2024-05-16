package air;

public class Plane implements IAirVehicle{

    private int numberOfSeats;
    private boolean foodWithFlight;
    private int numberOfEngines;

    public Plane(int numberOfSeats, boolean foodWithFlight){
        this.numberOfSeats = numberOfSeats;
        this.foodWithFlight = foodWithFlight;
        this.numberOfEngines = 3;
    }

    public int getNumberOfEngines() {
        return this.numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean getFoodWithFlight(){
        return this.foodWithFlight;
    }


    public void setFoodWithFlight(boolean foodWithFlight) {
        this.foodWithFlight = foodWithFlight;
    }


}
