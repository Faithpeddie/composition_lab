public class Speedboat extends Vehicle implements IWaterVehicle, IEngine {

    private boolean needsCrew;
    private IWaterVehicle waterVehicle;
    private IEngine engine;
    private String hullType;

    public Speedboat(float weight, int maxSpeed, boolean needsCrew, IEngine engine){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.hullType = "carbon fibre";
        this.engine = engine;
    }

    public IWaterVehicle getWaterVehicle(){
        return this.waterVehicle;
    }

    public void setWaterVehicle(IWaterVehicle waterVehicle){
        this.waterVehicle = waterVehicle;
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

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
    }

}
