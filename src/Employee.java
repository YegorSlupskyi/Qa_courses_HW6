package src;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private double rate;

    public Employee(String firstName, String lastName, String position, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.rate = rate;
    }

    public String getFullName() {
        return this.getFirstName() + " "
                + this.getLastName();
    }

    public String toString() {
        return this.getFirstName() + " "
                + this.getLastName() + " "
                + this.getPosition() + " "
                + this.getRate();
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double newRate) {
        this.rate = newRate;
    }


}
