public class PersonApp {
    public static void main(String[] args) throws Exception {
        // Object Creation
        Person person1 = new Person("Marine", 22);
        Person person2 = new Person("Beans", 2);

        System.out.println(person2.getName());

        // Aliases
        Person aliasPerson1 = person1;

        // Cloning
        Person clonPerson1 = new Person(person1.getName(), person1.getAge());

        /*
         * What is the difference between an alias and a clone?
         * 
         * An alias points to the same object, while a clone creates a new, distinct
         * object with the same or similar characteristics.
         */
    }

}
