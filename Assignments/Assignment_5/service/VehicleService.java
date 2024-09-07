package Assignment_5.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Assignment_5.dao.VehicleDao;
import Assignment_5.model.Vehicle;

public class VehicleService {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    protected Vehicle vehicle = new Vehicle();

    protected void getCommonInfo() {
        try {
            System.out.print("Enter Brand : ");
            this.vehicle.setBrand(br.readLine());
            System.out.print("Enter Model : ");
            this.vehicle.setModel(br.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    protected void getSpecificInfo() {

    }

    public void registerVehicle() {
        getCommonInfo();
        getSpecificInfo();
        Vehicle.setVehicleCount(Vehicle.getVehicleCount() + 1);
        VehicleDao.registerVehicle(this.vehicle);
    }

}
