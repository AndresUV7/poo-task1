package practice1;
import java.util.List;

//Hereda de la clase Student
public class UniversityStudent extends Student {

    private String career;

    public UniversityStudent(String name,
            String birthDate,
            List<Integer> grades,
            String career) {
        super(name, birthDate, grades);
        this.career = career;
    }

    //Getters & Setters
    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    
}
