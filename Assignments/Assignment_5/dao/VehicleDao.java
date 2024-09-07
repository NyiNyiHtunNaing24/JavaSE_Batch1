package Assignment_5.dao;

import Assignment_5.model.Vehicle;

public class VehicleDao {
    
    public static Vehicle[] VehicleDB = new  Vehicle[1000];

    //insert
    public static void  registerVehicle(Vehicle vehicle) {
        VehicleDB[Vehicle.getVehicleCount() - 1] = vehicle;
    }

    //display
    public static Vehicle[] getAllVehicles() {
        return VehicleDB;
    }
}
