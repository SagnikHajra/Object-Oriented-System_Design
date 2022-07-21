
import java.time.LocalTime;


public class Slot {
    private int id;
    public Vehicle vehicle;
    private LocalTime entryTime;
    private boolean empty = true;

    public void setVehicleDetails(int id, Vehicle vehicle) {
        this.id = id;
        this.vehicle = vehicle;
        this.entryTime = LocalTime.now();
        this.empty = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

}
