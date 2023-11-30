import java.util.Objects;

public class Animal {
    public int age;
    public double weight;
    public String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(age, weight, name);
        int result = 17;
        result = 31 * result + age;
        result = 31 * result +
                (int)(Double.doubleToLongBits(weight)
                        ^ (Double.doubleToLongBits(weight) >>> 32));
        result = 31 * name.hashCode();
        return result;

    }
}
