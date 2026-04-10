
public class LabAssistant extends StaffMember {
    private int hoursWorked;
    private double hourlyRate;
    
    public LabAssistant(String staffID, String fullName, String department,
                        int hoursWorked, double hourlyRate) {
        super(staffID, fullName, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }
    
    public void displayLabAssistantDetails() {
        displayBasicDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Monthly Payment: $" + calculateMonthlyPayment());
    }

    private void displayBasicDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
public class Lab04Main {
    public static void main(String[] args) {
        // department can be used inside child class because it is 'protected'
        
        Lecturer lecturer1 = new Lecturer("L001", "Dr. John Smith", 
                                          "Computer Science", 4, 2500.0);
        LabAssistant assistant1 = new LabAssistant("A001", "Ms. Jane Doe",
                                                   "Physics Lab", 120, 18.5);
        
        System.out.println("--- Lecturer Details ---");
        lecturer1.displayLecturerDetails();
        
        System.out.println("\n--- Lab Assistant Details ---");
        assistant1.displayLabAssistantDetails();
    }
}