package Person;

public class Dancer extends Person {
    private String city;

    public Dancer() {
    }

    public Dancer(String name, String city) {
        super(name);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public void methodWalk() {
        System.out.println("Person.Person.Dancer is walking ");
    }


    @Override
    public String toString() {
        return super.toString()+ "Person.Person.Dancer{" +
                "city='" + city + '\'' +
                '}';
    }
}
