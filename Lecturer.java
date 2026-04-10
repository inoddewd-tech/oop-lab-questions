
public class Lecturer extends StaffMember {

    private int courseCount;
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffId, String department,
                     int courseCount, double paymentPerCourse) {
        super(fullName, staffId, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    public void displayLecturerDetails() {
        displayBasicDetails();
        System.out.println("Courses: " + courseCount);
    }
}
