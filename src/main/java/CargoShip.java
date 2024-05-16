public class CargoShip extends Vehicle implements IWaterVehicle,IEngine {


    private int numberOfContainers;
    private IWaterVehicle waterVehicle;
    private IEngine engine;
    private String hullType;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = "aluminium";
        this.engine = engine;
    }

    public IEngine getEngine(){
        return this.engine;
    }
    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
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

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
}
