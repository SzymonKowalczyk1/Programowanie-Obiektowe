public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Krowa");
        Animal animal2 = new Animal("Krowa");
        System.out.println(animal.equals(animal2));
        animal2.dajGlos();
        Cat kot = new Cat("Filemon");
        kot.dajGlos();
        Animal animal3 = new Cat("Filemon");
        System.out.println(animal3.getClass());

        Person person = new Person("Jan","Kowalski");
        System.out.println(person.lastName);
        Employee employee = new Employee("Marek","Mucha");
        employee.displayData();

    }
}


