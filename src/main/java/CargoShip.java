public class CargoShip extends Vehicle implements IWaterVehicle {

    // aaron add IEngine

    private int numberOfContainers;
    private IWaterVehicle waterVehicle;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
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

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
}
