import java.util.*;

public class Classroom {
    int maxNumberOfStudents;
    Student [] students;



    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(){
        double sum = 0;
        for(Student student : students){
            sum += student.getAverageExamScores();
        }
        return sum / students.length;
    }

    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
            }
        }
    }

    public Student [] removeStudent(String firstName,String lastName){
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        for(Student student : students){
             if (student.getFirstName().equalsIgnoreCase(firstName) && student.getLastName().equalsIgnoreCase(lastName)){
                 studentList.remove(student);
                 studentList.add(null);

             }
        }
        return studentList.toArray(new Student[0]);
    }

    public Student[] getStudentByScore(){
        List<Student> studentList = new ArrayList<Student> (Arrays.asList(students));

        Comparator<Student> examScores = Comparator.comparing(Student::getAverageExamScores);
        Comparator<Student> firstName = Comparator.comparing(Student::getFirstName);

        Collections.sort(studentList, examScores.reversed().thenComparing(firstName));

        Student[] studentsSortedByScore = studentList.toArray(new Student[0]);

        return studentsSortedByScore;

    }

    public HashMap<Student, String > getGradeBook() {
        HashMap<Student, String> grades = new HashMap<>();
        Student [] averageExamScores = getStudentByScore();
        
    }


}
