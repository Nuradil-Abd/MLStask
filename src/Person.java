import java.util.Arrays;

public class Person {
    private String name, status;
    private int age;
    private Car car;

    public Person() {
    }

    public Person(String name, String status, int age) {
        this.name = name;
        this.status = status;
        this.age = age;
    }

    public Person(String name, String status, int age, Car car) {
        this.name = name;
        this.status = status;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void getInfo() {

        System.out.print("Person" +
                "\n name: '" + name + '\'' +
                "\n status: '" + status + '\'' +
                "\n age: " + age );
    }
}
