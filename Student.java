import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        return this.examScores.toString();
    }





    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber,newScore);
    }

    public double getAverageExamScores(){
        double sum = 0;
        double average = 0;
        for(Double examScore : examScores) {
                sum += examScore;
        }
        average = sum / examScores.size();
        return average;

    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }
}
