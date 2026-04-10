
public class LabAssistant extends StaffMember {

    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffId, String department,
                        int hoursWorked, double hourlyRate) {
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
