import java.util.Comparator;

public class Student implements Comparable<Student>,Cloneable {
    String name;
    int yearofBirth;
    double averageGrade;

    public Student(String name, double averageGrade, int yearofBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearofBirth = yearofBirth;

    }

    public Student(double averageGrade) {
        name = "default";
        yearofBirth = 2000;
        this.averageGrade = averageGrade;
    }

    public Student(int yearofBirth) {
        name = "default";
        this.yearofBirth = yearofBirth;
        this.averageGrade = 4.0;
    }

    @Override
    public String toString() {
        return " " + averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        return (int) Math.signum(o.averageGrade - this.averageGrade);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class AverageGradeStudentComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) Math.signum(o2.averageGrade - o1.averageGrade);
    }
}

class YearofBirthStudentComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o2.yearofBirth - o1.yearofBirth);
    }
}