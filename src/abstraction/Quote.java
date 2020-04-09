package abstraction;

abstract class Quote {
private String customerName;
private int totalSquareFeet;
private double price;
    Quote() {
        this.customerName = "Nilfilsa";
        this.totalSquareFeet = 0;
        this.price = 0;
    }
     Quote(String customerName, int totalSquareFeet, double price) {
        this.customerName = customerName;
        this.totalSquareFeet = totalSquareFeet;
        this.price = price;

}
    abstract double calculateTotalPrice();
    abstract void printQuote();

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(int totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
