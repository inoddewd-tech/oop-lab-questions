
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
    
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.trim().isEmpty()) {
            this.department = newDepartment;
            System.out.println("Department updated to: " + department);
        } else {
            System.out.println("Invalid department name. No changes made.");
        }
    }
    
    public final void showCommonNotice() {
        System.out.println("NOTICE: All staff members must complete monthly timesheets by the 25th.");
    }
}