package Homework_1;

import java.util.ArrayList;
import java.util.Collections;

public class BusStation {
    ArrayList<Vehicle> vehicles;

    public BusStation() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void parkVehicle(Vehicle v){
        vehicles.add(v);
    }

    public void leaveStation(Vehicle v){
        vehicles.remove(v);
    }

    public void showAllVehicles(){
        int i = 1;
        for(Vehicle v : vehicles){
            System.out.print(i + ". ");
            v.display();
            i++;
        }
    }

    public void showTotalProfit(){
        double sum = 0.0;
        for(Vehicle v: vehicles){
            sum+=v.profit();
        }
        System.out.println("The total profit is: " + sum);
    }

    public void sortVehicles(){
        Collections.sort(vehicles);
    }

}
