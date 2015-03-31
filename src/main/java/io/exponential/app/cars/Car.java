package io.exponential.app.cars;

public class Car {
    private long id;
    private String make;
    private String model;

    public Car() {}

    public Car(long id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
