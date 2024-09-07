package Assignment_5.service;

import Assignment_5.model.Motorcycle;

public class MotorcycleService extends VehicleService {

    private Motorcycle motorcycle = new Motorcycle();

    @Override
    protected void getSpecificInfo() {
        try {
            this.motorcycle.setBrand(vehicle.getBrand());
            this.motorcycle.setModel(vehicle.getModel());

            System.out.print("Has side car : ");
            this.motorcycle.setHasSideCar(br.readLine());
            vehicle = this.motorcycle;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
