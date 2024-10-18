package practice1;
import java.util.List;
import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthDate;
    private List<Integer> grades;

    public Student(String name,
            String birthDate,
            List<Integer> grades) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
        this.grades = grades;
    }

    // Método obtenerNombre()
    public String getName() {
        return name;
    }

    // Método actualizarNombre()
    public void setName(String name) {
        this.name = name;
    }

    // Método calcularEdad()
    public int getAge() {
        LocalDate today = LocalDate.now(); // Obtener la fecha actual
        // Calcular la edad en años
        int age = today.getYear() - birthDate.getYear(); 
        // Verificar si el cumpleaños de este año ya ha pasado
        if (birthDate.getDayOfYear() > today.getDayOfYear()) {
            age--; // Si no ha pasado, restar un año
        }

        return age;
    }

    // Método agregarCalificación()
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // Método calcularPromedio()
    public double getAverageGrade() {

        double sum = 0;
        // Sumar todas las calificaciones
        for (Integer grade : grades) {
            sum += grade;
        }
        // Dividir por el número de calificaciones
        return Math.round((sum / grades.size()) * 100.0) / 100.0;
    }
}
