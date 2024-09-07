package Assignment_5.model;

public class Motorcycle extends Vehicle {

    private String hasSideCar;

    @Override
    public void displayVehicle() {
        System.out.println("Vechicle Type : Motorcycle");
        super.displayVehicle();
        System.out.println("Side Car present : " + this.getHasSideCar());
    }

    public void setHasSideCar(String hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public String getHasSideCar() {
        return hasSideCar;
    }
}
