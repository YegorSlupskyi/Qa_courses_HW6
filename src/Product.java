package src;

public class Product {
    private String title;
    private int id;
    private double price;
    private String description;
    private boolean isAvailable;

    public Product(String title, int id, double price, String description, boolean isAvailable) {
        this.title = title;
        this.id = id;
        this.price = price;
        this.description = description;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean newIsAvailable) {
        this.isAvailable = newIsAvailable;
    }

    public String toString() {
        return this.getTitle() + " "
                + this.getId() + " "
                + this.getPrice() + " "
                + this.getDescription() + " "
                + this.getIsAvailable();
    }

}
