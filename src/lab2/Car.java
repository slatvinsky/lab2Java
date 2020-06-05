package lab2;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String price;
    private String registrationNumber;
    private int yearOfIssue;

    public Car(int id, String model, String price, String registrationNumber, int yearOfIssue) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", gender=" + registrationNumber +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                registrationNumber == car.registrationNumber &&
                yearOfIssue == car.yearOfIssue &&
                Objects.equals(model, car.model) &&
                Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, price, registrationNumber, yearOfIssue);
    }
}
