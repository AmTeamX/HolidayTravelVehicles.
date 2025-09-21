class TradeInVehicle extends Vehicle {
    public TradeInVehicle(String serialNumber, String make, String model, int year) {
        super(serialNumber, make, model, year, 0); 
    }

    @Override
    public String toString() {
        return "Trade-In: " + getVehicleInfo();
    }
}
