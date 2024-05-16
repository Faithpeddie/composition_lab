public class Kayak extends Vehicle implements IWaterVehicle {

    private int numberOfPaddles;
    private IWaterVehicle waterVehicle;

    public Kayak(float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;

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




    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }
}
