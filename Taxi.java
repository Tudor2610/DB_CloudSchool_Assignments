package Homework_1;

public class Taxi extends Vehicle{
    private int noPassengers;
    private double ticketPrice;

    public Taxi() {
        this.noPassengers = 1;
        this.ticketPrice = 6;
    }

    public Taxi(String colour, boolean functional, int noPassengers, double ticketPrice) {
        super(colour, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public void setNoPassengers(int noPassengers) {
        this.noPassengers = noPassengers;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double profit() {
        return 0.25*charge();
    }

    @Override
    public double charge() {
        return noPassengers*ticketPrice;
    }

    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + ": " + noPassengers + " Passengers, the ticket costs "+ ticketPrice + " euros, and the profit is " + profit() + " euros");
    }
}
