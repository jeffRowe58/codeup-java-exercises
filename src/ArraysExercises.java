import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] x, Person newPerson){
        Person[] copy = Arrays.copyOf(x, x.length + 1);
        copy[copy.length -1] = newPerson;
        return copy;
        }




    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] person = new Person[3];

        person[0] = new Person("Jim");
        person[1] = new Person("Jack");
        person[2] = new Person("Johnny");

        for(Person name : person){
            System.out.println(name.getName());
        }
        System.out.println("--------");
        Person Jeff = new Person("Jeff");
         person = addPerson(person, Jeff);
         for(Person people : person) {
             System.out.println(people.getName());

         }
    }
}
