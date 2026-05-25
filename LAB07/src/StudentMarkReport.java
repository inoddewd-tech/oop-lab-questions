public class StudentMarkReport {

    private String[] marks;

    // Constructor
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get mark at a given index
    public int getMarkAt(int index) {

        String selectedMark = marks[index];

        return Integer.parseInt(selectedMark);
    }
}
