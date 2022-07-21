import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        HandleCommands cmd = new HandleCommands();
        System.out.println("***************************************************");
        System.out.println("*************Welcome To Parking Plot**************");
        System.out.println("***************************************************");

        while (true) {
            System.out.println("Park a Vehicle: 1");
            System.out.println("Get All vehicles' details: 2");
            System.out.println("Get all vehicles of Color: 3");
            System.out.println("Get vehicle details: 4");
            System.out.println("Vehicle Exit: 5");
            System.out.println("Your Input: ");

            Scanner input = new Scanner(System.in);

            switch (input.nextLine()) {
                case "1":
                    cmd.parkVehicle();
                    break;
                case "2":
                    cmd.getAllVehicleDetails();
                    break;
                case "3":
                    cmd.getAllVehiclesOfASingleColor();
                    break;
                case "4":
                    cmd.getVehicleDetails();
                    break;
                case "5":
                    cmd.pullOutAVehicle();
                    break;
                case "exit":
                    System.out.println("Bye...");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Not a valid Input");

            }
        }

    }

}
