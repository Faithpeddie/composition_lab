public class Pedalboat extends Vehicle implements IWaterVehicle {

    private int numberOfSeats;
    private IWaterVehicle waterVehicle;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
    }


    public IWaterVehicle getWaterVehicle(){
        return this.waterVehicle;
    }

    public void setWaterVehicle(IWaterVehicle waterVehicle){
        this.waterVehicle = waterVehicle;
    }

    public String getHullType(){
        return this.getHullType();
    }

    public void setHullType(String hullType){
        this.waterVehicle.setHullType(hullType);
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }



}
