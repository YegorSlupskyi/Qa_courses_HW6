package src;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String toString() {
        return this.getSideA() + " "
                + this.getSideB() + " "
                + this.getSideC();
    }

    public double perimeter() {
        return this.getSideA() + this.getSideB() + this.getSideC();
    }

    public double area() {
        double demiPerimeter = this.perimeter() / 2;
        return Math.sqrt(demiPerimeter * (demiPerimeter - this.getSideA()) * (demiPerimeter - this.getSideB()) * (demiPerimeter - this.getSideC()));
    }

    public double getSideA() {
        return this.sideA;
    }
    public void setSideA(double newSideA) {
        this.sideA = newSideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(double newSideB) {
        this.sideB = newSideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public void setSideC(double newSideC) {
        this.sideC = newSideC;
    }
}
