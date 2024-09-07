package Assignment_5.model;

public class Truck extends Vehicle {

    private int payloadCapacity;

    @Override
    public void displayVehicle() {
        System.out.println("Vechicle Type : Truck");
        super.displayVehicle();
        System.out.println("PayloadCapacity : " + this.getPayloadCapacity());
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}
