package Person;

public class Programmer extends Person {
    public int age;

    public Programmer() {
    }

    public Programmer(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void methodWalk() {
        System.out.println( "Person.Person.Programmer is walking " );

    }


    @Override
    public String toString() {
        return super.toString()+ "Person.Person.Programmer{" +
                "age=" + age +
                '}';
    }
}
