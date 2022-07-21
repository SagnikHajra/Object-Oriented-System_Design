import java.util.Scanner;

public class HandleCommands {
    private final Slot[] vehicleSlots = {new Slot(), new Slot(), new Slot(), new Slot(), new Slot()};
    Scanner input = new Scanner(System.in);

    public void parkVehicle(){
        boolean found = false;
        for(int index=0; index<5; index++){
            if (vehicleSlots[index].isEmpty()){
                System.out.printf("Slot number %d is available \n", index);
                System.out.println("Vehicle Number: ");
                String carNumber = input.nextLine();
                System.out.println("Vehicle Color: ");
                String colorOfCar = input.nextLine();
                Vehicle car = new Vehicle(carNumber.toUpperCase(), colorOfCar.toUpperCase());
                vehicleSlots[index].setVehicleDetails(index, car);
                System.out.printf("Vehicle number %s is parked at slot %d \n", carNumber, index);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Sorry!! The Parking is full, please wait...");
        }
        System.out.println("");
    }
    public void getAllVehicleDetails(){
        boolean found = false;
        for(int index=0; index<5; index++){
            if (!vehicleSlots[index].isEmpty()){
                System.out.printf("Slot number %d is has a %s car, registration: %s\n", index, vehicleSlots[index].vehicle.getColor(), vehicleSlots[index].vehicle.getRegistrationNumber());
                found = true;
            }
        }
        if(!found){
            System.out.println("Parking lot is empty...");
        }
        System.out.println("");
    }

    public void getAllVehiclesOfASingleColor(){
        System.out.println("Search a Color: ");
        String color = input.nextLine();
        boolean found = false;
        for(int index=0; index<5; index++){
            if (!vehicleSlots[index].isEmpty() && vehicleSlots[index].vehicle.getColor().equals(color.toUpperCase())){
                System.out.printf("There is a %s car at slot %d, registration: %s\n", color, index, vehicleSlots[index].vehicle.getRegistrationNumber());
                found = true;
            }
        }
        if(!found){
            System.out.printf("There is no %s car found at the parking lot", color);
        }
        System.out.println("");
    }
    public void getVehicleDetails(){
        System.out.println("Please enter the vehicle's number: ");
        String registration = input.nextLine();
        boolean found = false;
        for(int index=0; index<5; index++){
            if (!vehicleSlots[index].isEmpty() && vehicleSlots[index].vehicle.getRegistrationNumber().equals(registration.toUpperCase())){
                System.out.printf("There is a %s car at slot %d, of this registration\n", vehicleSlots[index].vehicle.getColor(), index);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Sorry!! Registration number wasn't found");
        }
        System.out.println("");
    }
    public void pullOutAVehicle(){
        System.out.println("Please enter the vehicle's number: ");
        String registration = input.nextLine();
        boolean found = false;
        for(int index=0; index<5; index++){
            if (!vehicleSlots[index].isEmpty() && vehicleSlots[index].vehicle.getRegistrationNumber().equals(registration.toUpperCase())){
                System.out.printf("Car parked at slot %d is leaving\n", index);
                vehicleSlots[index] = new Slot();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Sorry!! Registration number wasn't found");
        }
        System.out.println("");
    }
}
