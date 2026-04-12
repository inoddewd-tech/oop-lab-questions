public class Lab04Main {

    public static void main(String[] args) {

        // System name
        StaffMember.showSystemName();

        // Policy
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

        
        Lecturer lec1 = new Lecturer("Nimal Perera", "L001", "IT", 3, 50000);
        Lecturer lec2 = new Lecturer("Kamal Silva", "L002", "CS", 2, 60000);
        LabAssistant lab1 = new LabAssistant("Saman Kumara", "A001", "IT", 120, 500);

        
        lec1.changeDepartment("Software Engineering");

        System.out.println("\n--- Lecturer 1 Details ---");
        lec1.displayLecturerDetails();
        double pay1 = lec1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + pay1);
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(pay1));

        System.out.println("\n--- Lecturer 2 Details ---");
        lec2.displayLecturerDetails();
        double pay2 = lec2.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + pay2);
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(pay2));

        System.out.println("\n--- Lab Assistant Details ---");
        lab1.displayLabAssistantDetails();
        double pay3 = lab1.calculateMonthlyPayment();
        System.out.println("Monthly Payment: " + pay3);
        System.out.println("Bonus: " + UniversityPolicy.calculateBonus(pay3));

        // Total payment
        double total = pay1 + pay2 + pay3;
        System.out.println("\nTotal Monthly Payment: " + total);

        // Staff count
        System.out.println("Total Staff Count: " + StaffMember.getStaffCount());

        // Common notice
        System.out.println("\n--- Notices ---");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab1.showCommonNotice();
    }
}