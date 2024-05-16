public class Kayak extends Vehicle implements IWaterVehicle {

    private int numberOfPaddles;
    private IWaterVehicle waterVehicle;
    private String hullType;


    public Kayak(float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;
        this.hullType = "carbon fibre";
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

    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }
}
