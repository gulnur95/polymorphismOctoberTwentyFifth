import animal.Animal;
import animal.Eagle;
import animal.Shark;
import animal.Turtle;

public class Main {
    public static void main(String[] args) {

        //    Task       LMS        Polymorphism
           Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];


        int sharkIndex = 0;
        int turtleIndex = 0;
        int eagleIndex = 0;

        for(Animal animal: animals){
            if(animal instanceof Shark){
                ((Shark)animal).attack();
                sharks[sharkIndex++]=(Shark)animal;
            } else if(animal instanceof Turtle){
                ((Turtle)animal).swim();
                turtles[turtleIndex++] = (Turtle)animal;
            } else if (animal instanceof Eagle) {
                ((Eagle)animal).fly();
                eagles[eagleIndex++] = (Eagle)animal;
            }
        }
        System.out.println("\n Sharks array: " );
        for (int i = 0; i < sharkIndex; i++){
            System.out.println("Sharks at index " + i);
        }

        System.out.println("\nTurtles array:");
        for (int i = 0; i < turtleIndex; i++){
            System.out.println("Turtle at index " + i);
        }

        System.out.println("\nEagles array: ");
        for (int i = 0; i < eagleIndex; i++){
            System.out.println("Eagle at index "+ i);
        }






//   1 object     Parent child1 = new Child();
//   2 object     Object child2 = new Child();
//   3 object     Child child3 = new Child();



//          Task 1    Polymorphism
//        Person.Person[] people  = {
//                new Person.Person.Programmer(),
//                new Person.Person.Dancer(),
//                new Person.Person.Singer()
//        };
//
//        for(Person.Person person : people){
//            person.methodWalk();
//        }


        /*       Task 1    Polymorphism
        Person.Person деген класс түзүнүз жана бул класстын walk деген методу болсун. Person.Person ду мурастаган 3 класс түзүңүз
        Person.Person.Programmer, Person.Person.Dancer жана Person.Person.Singer деген. Бул уч класс parent класстагы walk
        методун @Override кылсын бирок реализациясы башкача болсун.
        Массив түзүп бир программистти, бийчини жана ырчыны салыңыз жана ал массивдеги адамдарды бастырыныз.
         */

//        Person.Person programmer = new Person.Person.Programmer("David", 29);
//        Person.Person  dancer = new Person.Person.Dancer("Tommy", "London");
//        Person.Person singer = new Person.Person.Singer("Jane", "Walk Street");
//
//        Person.Person[] people = {programmer, dancer, singer};
//        for(Person.Person person : people){
//            System.out.println(person.toString());
//            person.methodWalk();
//        }
























    }
}