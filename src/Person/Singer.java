package Person;

public class Singer extends Person {

    private String address;

    public Singer() {
    }

    public Singer(String name, String address) {
        super(name);
        this.address = address;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void methodWalk() {
        System.out.println("Person.Person.Singer is walking");
    }

    @Override
    public String toString() {
        return super.toString()+ "Person.Person.Singer{" +
                "address='" + address + '\'' +
                '}';
    }
}
