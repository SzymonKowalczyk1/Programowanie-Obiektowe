import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person   = new Person("Stefan", -15);
        Person person2 = new Person("Stefan",30);
        System.out.println(person);
        System.out.println(person.equals(person2));
        person.greet();

        BookDTO book = new BookDTO("Harry Potter", "JK",25,2001);
        System.out.println(book);
        BookDTO book2 = new BookDTO("Wesele", "Wyspianski", 30 , 1940);
        System.out.println(book2);
        Address address = new Address("Prosta",30,92,"warszawa");
        Student student = new Student("Jan","Kowalski", List.of(5,3,4,2));
        System.out.println(student.averageGrades());
    }
    }
