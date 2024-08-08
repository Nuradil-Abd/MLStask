public class Car {
    private String model, color;
    private int price, dateOfIssue;

    public Car() {
    }

    public Car(String model, String color, int price, int dateOfIssue) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.dateOfIssue = dateOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }


    public String getInfo() {
        return "Car" +
                "\nmodel: '" + model + '\'' +
                "\ncolor: '" + color + '\'' +
                "\nprice: " + price +
                "\ndate of issue: " + dateOfIssue +
                "\n";
    }
}
