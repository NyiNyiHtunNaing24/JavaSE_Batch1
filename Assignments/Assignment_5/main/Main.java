package Assignment_5.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Assignment_5.dao.VehicleDao;
import Assignment_5.model.Vehicle;
import Assignment_5.service.CarService;
import Assignment_5.service.MotorcycleService;
import Assignment_5.service.TruckService;
import Assignment_5.service.VehicleService;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String type;
        String flag;
        VehicleService vehicleService = null;

        do {
            System.out.print("Enter the type of vehicle (Car,Truck,Motorcycle) : ");
            type = br.readLine();
            if (type.equalsIgnoreCase("Car")) {
                vehicleService = new CarService();
            } else if (type.equalsIgnoreCase("Truck")) {
                vehicleService = new TruckService();
            } else if (type.equalsIgnoreCase("Motorcycle")) {
                vehicleService = new MotorcycleService();
            }

            vehicleService.registerVehicle();

            System.out.print("Do you want to add another vehicle? (Yes/No)");
            flag = br.readLine();
        } while (flag.equals("Yes"));

        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            VehicleDao.getAllVehicles()[i].displayVehicle();
        }
    }
}
