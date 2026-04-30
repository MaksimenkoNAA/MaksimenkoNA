import java.util.*;
public class Lesson36 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Мария Иванова", "ИТ-101", 1, new int[]{4, 5, 4, 3}));
        students.add(new Student("Александр Сидоров", "ИТ-101", 1, new int[]{2, 2, 3, 2}));
        students.add(new Student("Анна Петрова", "ИТ-201", 2, new int[]{5, 4, 5, 5}));
        students.add(new Student("Степан Козлов", "ИТ-201", 2, new int[]{3, 3, 4, 3}));
        students.add(new Student("Анастасия Волкова", "ИТ-301", 3, new int[]{2, 1, 2, 1}));
        System.out.println("ИСХОДНЫЕ ДАННЫЕ");
        for (Student student : students) {
            System.out.println(student);
        }
        StudentManager.printStudents(students, 1);
        System.out.println("Исключение студентов со средним баллом < 3");
        StudentManager.removeLowPerformers(students);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Перевод на следующий курс");
        StudentManager.promoteToNextCourse(students);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Списки студентов по курсам после изменений");
        StudentManager.printStudents(students, 1);
        StudentManager.printStudents(students, 2);
        StudentManager.printStudents(students, 3);
        StudentManager.printStudents(students, 4);
    }
}
