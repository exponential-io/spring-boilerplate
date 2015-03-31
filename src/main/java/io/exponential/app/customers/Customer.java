package io.exponential.app.customers;


public class Customer {
    private long id;
    private String name;
    private int age;

    public Customer() {

    }

    public Customer(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name='%s', age='%d']", id, name, age);
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
