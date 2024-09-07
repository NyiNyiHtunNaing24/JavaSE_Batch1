package Assignment_5.model;

public class Vehicle {

    protected String brand;
    protected String model;
    protected static int vehicleCount = 0;

    public void displayVehicle() {
        System.out.println("Brand : " + this.getBrand());
        System.out.println("Model : " + this.getModel());
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void setVehicleCount(int vehicleCount) {
        Vehicle.vehicleCount = vehicleCount;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }
}
