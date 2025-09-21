import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Vehicle {
    protected String serialNumber;
    protected String make;
    protected String model;
    protected int year;
    protected double baseCost;
    protected boolean isSold = false;

    public Vehicle(String serialNumber, String make, String model, int year, double baseCost) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() { return serialNumber; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getBaseCost() { return baseCost; }

    public void setSold(boolean sold) { isSold = sold; }

    public String getVehicleInfo() {
        return String.format("%d %s %s", year, make, model);
    }
    
    @Override
    public String toString() {
        return "Purchased Vehicle: " + getVehicleInfo();
    }
}
