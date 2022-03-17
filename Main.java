package Homework_1;

public class Main {
    public static void main(String[] args) {
        BusStation station = new BusStation();

        station.parkVehicle(new Bus());
        station.parkVehicle(new Taxi());
        station.parkVehicle(new Bus("yellow", true, 20, 2.5));
        station.parkVehicle(new Taxi("white", true, 3, 10));
        station.parkVehicle(new Taxi("blue", true, 2, 11));

        station.showAllVehicles();
        station.showTotalProfit();
        station.sortVehicles();
        station.showAllVehicles();
    }
}
