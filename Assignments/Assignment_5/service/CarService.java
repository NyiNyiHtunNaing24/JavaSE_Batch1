package Assignment_5.service;

import Assignment_5.model.Car;

public class CarService extends VehicleService {

    private Car car = new Car();

    @Override
    protected void getSpecificInfo() {
        try {
            this.car.setBrand(vehicle.getBrand());
            this.car.setModel(vehicle.getModel());

            System.out.print("Enter the number of doors : ");
            this.car.setDoors(Integer.parseInt(br.readLine()));
            this.vehicle = this.car;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
