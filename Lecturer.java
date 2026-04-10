
public class Lecturer extends StaffMember {
    private int courseCount;
    private double paymentPerCourse;
    
    public Lecturer(String staffID, String fullName, String department, 
                    int courseCount, double paymentPerCourse) {
        super(staffID, fullName, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }
    
    
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }
    
    public void displayLecturerDetails() {
        displayBasicDetails();
        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment Per Course: $" + paymentPerCourse);
        System.out.println("Monthly Payment: $" + calculateMonthlyPayment());
    }
}
public class Lab04Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("L001", "Dr. John Smith", 
                                          "Computer Science", 4, 2500.0);
        lecturer1.displayLecturerDetails();
        System.out.println("\nMonthly Payment: $" + lecturer1.calculateMonthlyPayment());
    }
}