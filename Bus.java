package Homework_1;

public class Bus extends Vehicle{
    private int noPassengers;
    private double ticketPrice;

    public Bus() {
        this.noPassengers = 5;
        this.ticketPrice = 3;
    }

    public Bus(String colour, boolean functional, int noPassengers, double ticketPrice) {
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
        System.out.println(getClass().getSimpleName() + ": " + noPassengers + " Passengers, ticket costs "+ ticketPrice + " euros, and the profit is " + profit() + " euros");
    }
}
