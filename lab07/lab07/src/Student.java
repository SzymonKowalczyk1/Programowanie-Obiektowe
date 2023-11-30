import java.util.List;

public record Student(String imie, String nazwisko, List<Integer>grades ) {
    public double averageGrades(){
        double liczby = 0;
        for(int i = 0; i < grades.size(); i++){
            liczby += grades.get(i);
        }
        return liczby / grades.size();
    }
}

