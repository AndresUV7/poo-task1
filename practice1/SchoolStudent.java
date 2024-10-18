package practice1;

import java.util.List;

public class SchoolStudent extends Student {

    // Representante del estudiante
    private String tutor;
    // Nota en conducta
    private int conductGrade;

    public SchoolStudent(String name,
            String birthDate,
            List<Integer> grades,
            String tutor,
            int conductGrade) {
        super(name, birthDate, grades);
        this.tutor = tutor;
        this.conductGrade = conductGrade;
    }

    // Getters & Setters
    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getConductGrade() {
        return conductGrade;
    }

    public void setConductGrade(int conductGrade) {
        this.conductGrade = conductGrade;
    }

    // Polimorfismo
    @Override
    public double getAverageGrade() {
        // Promedio incluyendo la nota de conducta y redondeo a un decimal
        return Math
                .round(((super.getAverageGrade() + conductGrade) / 2.0) * 10.0)
                / 10.0;
    }
}
