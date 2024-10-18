package practice1;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Practice1 {

    public static void main(String[] args) {
        List<Integer> universityGrades = new ArrayList<>(Arrays.asList(70, 70, 70));
        // Instancia de la clase Student
        Student student = new UniversityStudent("Juan Pérez",
                "2000-10-18",
                universityGrades,
                "Software Engineering");

        student.addGrade(100);
        System.out.println("--- ESTUDIANTE UNIVERSITARIO ---");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad (años): " + student.getAge());
        System.out.println("Promedio: " + student.getAverageGrade());


        List<Integer> schoolGrades = new ArrayList<>(Arrays.asList(7, 7, 7));
        // Instancia de la clase Student
        Student student2 = new SchoolStudent("María Lopez",
                "2015-01-07",
                schoolGrades,
                "Pedro Lopez",
                10);

        student2.addGrade(10);
        System.out.println("--- ESTUDIANTE DE ESCUELA ---");
        System.out.println("Nombre: " + student2.getName());
        System.out.println("Edad (años): " + student2.getAge());
        System.out.println("Promedio: " + student2.getAverageGrade());
    }
}
