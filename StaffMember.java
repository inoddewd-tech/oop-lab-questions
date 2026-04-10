
// StaffMember.java - Abstract Parent Class
public abstract class StaffMember {
    private final String staffID;
    private final String fullName;
    protected String department;
    private static int staffCount = 0;
    
    // Constructor
    public StaffMember(String staffID, String fullName, String department) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
        staffCount++;
    }
    
    // Abstract method - must be implemented by child classes
    public abstract double calculateMonthlyPayment();
    
    // Final method - cannot be overridden by child classes
    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
    
    // Static method - can be called using class name
    public static void showSystemName() {
        System.out.println("Campus Staff Payment System");
    }
    
    // Static method to get staff count
    public static int getStaffCount() {
        return staffCount;
    }
    
    // Method for controlled update of department
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.trim().isEmpty()) {
            this.department = newDepartment;
            System.out.println("Department updated to: " + department);
        } else {
            System.out.println("Invalid department name. No changes made.");
        }
    }
    
    // Final method - common notice for all staff members
    public final void showCommonNotice() {
        System.out.println("NOTICE: All staff members must complete monthly timesheets by the 25th.");
    }
}