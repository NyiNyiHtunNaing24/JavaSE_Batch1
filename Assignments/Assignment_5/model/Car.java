package Assignment_5.model;

public class Car extends Vehicle {

    private int doors;

    @Override
    public void displayVehicle() {
        System.out.println("Vechicle Type : Car");
        super.displayVehicle();
        System.out.println("Number of Doors : " + this.getDoors());
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}
