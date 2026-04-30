import java.util.Arrays;
public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;
    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public int[] getGrades() {
        return grades != null ? grades.clone() : null;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double calculateAverageGrade() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    public String toString() {
        return String.format("Студент: %s, Группа: %s, Курс: %d, Оценки: %s, Средний: %.2f",
                name, group, course, Arrays.toString(grades), calculateAverageGrade());
    }
}