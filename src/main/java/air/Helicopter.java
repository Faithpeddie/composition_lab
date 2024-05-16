package air;

public class Helicopter implements IAirVehicle{

    private int numberOfWindows;
    private int numberOfRotorBlades;
    private String pilot;
    private int numberOfEngines;

    public Helicopter(int numberOfWindows, int numberOfRotorBlades, String pilot){
        this.numberOfWindows = numberOfWindows;
        this.numberOfRotorBlades = numberOfRotorBlades;
        this.pilot = pilot;
        this.numberOfEngines = numberOfEngines;
    }

    public int getNumberOfWindows() {
        return this.numberOfWindows
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfRotorBlades() {
        return this.numberOfRotorBlades;
    }

    public void setNumberOfRotorBlades(int numberOfRotorBlades) {
        this.numberOfRotorBlades = numberOfRotorBlades;
    }

    public String getPilot() {
        return this.pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

}
