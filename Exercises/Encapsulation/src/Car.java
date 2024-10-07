public class Car {
    private String color;
    private double price;
    private char size;

    // constructor
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    // getters
    public String getColor() {return color;}
    public double getPrice() {return price;}
    public char getSize() {return size;}

    // setters
    public void setColor(String color) {this.color = color;}
    public void setPrice(double price) {this.price = price;}
    public void setSize(char size) {this.size = Character.toUpperCase(size);}

    // toString
    @Override
    public String toString() {
        String sizeClass = (size == 'S') ? "small" : (size == 'M') ? "medium" : (size == 'L') ? "large" : "unknown";
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeClass);
    }

    public static void main(String[] args) {
        Car Ferrari = new Car("red", 19999.85, 'M');
        System.out.println(Ferrari);

        Car Mercedes = new Car("blue", 500000.00, 'L');
        System.out.println(Mercedes);
    }
}
