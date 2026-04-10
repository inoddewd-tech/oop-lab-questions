
public abstract class StaffMember {
    private final String staffID;
    private final String fullName;
    protected String department;
    private static int staffCount = 0;
    
    public StaffMember(String staffID, String fullName, String department) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
        staffCount++;
    }
    
    public abstract double calculateMonthlyPayment();
    
    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
    
    public static void showSystemName() {
        System.out.println("Campus Staff Payment System");
    }
    
    public static int getStaffCount() {
        return staffCount;
    }
}
public class Lab04Main {
    public static void main(String[] args) {
        // staffCount is static so it's shared across all objects
        
        StaffMember.showSystemName();
        
        Lecturer lecturer1 = new Lecturer("L001", "Dr. John Smith", 
                                          "Computer Science", 4, 2500.0);
        Lecturer lecturer2 = new Lecturer("L002", "Prof. Sarah Johnson",
                                          "Mathematics", 3, 2800.0);
        LabAssistant assistant1 = new LabAssistant("A001", "Ms. Jane Doe",
                                                   "Physics Lab", 120, 18.5);
        
        System.out.println("Total staff objects: " + StaffMember.getStaffCount());
    }
}