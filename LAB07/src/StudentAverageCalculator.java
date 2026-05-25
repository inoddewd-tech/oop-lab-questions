

public class StudentAverageCalculator {

    private int totalMarks;
    private int numberOfStudents;

    // Constructor
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to calculate average
    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}