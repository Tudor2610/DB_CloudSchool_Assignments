package Homework_1;

public abstract class Vehicle implements Comparable<Vehicle>{
    private String colour;
    private boolean functional;

    public Vehicle() {
        colour = "white";
        functional = true;
    }

    public Vehicle(String colour, boolean functional) {
        this.colour = colour;
        this.functional = functional;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }


    @Override
    public int compareTo(Vehicle o) {
        return Double.compare(profit(), o.profit());
    }

    public abstract double profit();

    public abstract double charge();

    public abstract void display();
}
