public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle("THAI6789", "ISUZU", "MU X", 2025, 150000.00);

        System.out.println("Vehicle Information:");
        System.out.println("===================");
        System.out.println("Serial Number: " + car.getSerialNumber());
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Base Cost: $" + String.format("%.2f", car.getBaseCost()));
        System.out.println("\nVehicle Summary: " + car.getVehicleInfo());
    }
}