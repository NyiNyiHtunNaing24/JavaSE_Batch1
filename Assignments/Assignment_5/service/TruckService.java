package Assignment_5.service;

import Assignment_5.model.Truck;

public class TruckService extends VehicleService {

    private Truck truck = new Truck();

    @Override
    protected void getSpecificInfo() {
        try {
            this.truck.setBrand(vehicle.getBrand());
            this.truck.setModel(vehicle.getModel());

            System.out.print("Enter the payload capacity : ");
            this.truck.setPayloadCapacity(Integer.parseInt(br.readLine()));
            vehicle = this.truck;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
