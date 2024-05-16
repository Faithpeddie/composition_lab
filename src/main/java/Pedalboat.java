public class Pedalboat extends Vehicle implements IWaterVehicle {

    private int numberOfSeats;
    private IWaterVehicle waterVehicle;
    private String hullType;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.hullType = "aluminium";
    }


    public IWaterVehicle getWaterVehicle(){
        return this.waterVehicle;
    }

    public void setWaterVehicle(IWaterVehicle waterVehicle){
        this.waterVehicle = waterVehicle;
    }

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }



}
