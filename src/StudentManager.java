import java.util.*;
public class StudentManager {
    public static void removeLowPerformers(Set<Student> students) {
        students.removeIf(student -> student.calculateAverageGrade() < 3.0);
    }

    public static void promoteToNextCourse(Set<Student> students) {
        for (Student student : students) {
            if (student.calculateAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        System.out.printf("\nСтуденты на %d курсе:%n", course);
        System.out.println("--------------------");
        boolean hasStudentsOnCourse = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                hasStudentsOnCourse = true;
            }
        }
        if (!hasStudentsOnCourse) {
            System.out.println("На данном курсе нет студентов.");
        }
    }
}
