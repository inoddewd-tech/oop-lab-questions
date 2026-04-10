package lab04;

public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();

        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

        Lecturer l1 = new Lecturer("Nimal Perera", "L001", "IT", 3, 50000);
        Lecturer l2 = new Lecturer("Kamal Silva", "L002", "CS", 2, 60000);
        LabAssistant la1 = new LabAssistant("Saman Kumara", "A001", "IT", 120, 500);

        // Change department
        l1.changeDepartment("Software Engineering");

        double total = 0;

        System.out.println("\n--- Lecturer 1 ---");
        l1.displayLecturerDetails();
        double pay1 = l1.calculateMonthlyPayment();
        System.out.println("Payment: " + pay1);

        System.out.println("\n--- Lecturer 2 ---");
        l2.displayLecturerDetails();
        double pay2 = l2.calculateMonthlyPayment();
        System.out.println("Payment: " + pay2);

        System.out.println("\n--- Lab Assistant ---");
        la1.displayLabAssistantDetails();
        double pay3 = la1.calculateMonthlyPayment();
        System.out.println("Payment: " + pay3);

        total = pay1 + pay2 + pay3;

        System.out.println("\nTotal Payment: " + total);
        System.out.println("Total Staff: " + StaffMember.getStaffCount());

        l1.showCommonNotice();
        l2.showCommonNotice();
        la1.showCommonNotice();
    }
}
