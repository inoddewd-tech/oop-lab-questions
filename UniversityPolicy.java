
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "Tech University";
    public static final double BONUS_RATE = 0.10;
    
    public static void showPolicyHeader() {
        System.out.println("=== UNIVERSITY POLICY ===");
        System.out.println("Bonus rate: " + (BONUS_RATE * 100) + "%");
    }
    
    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
public class Lab04Main {
    public static void main(String[] args) {
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        
        Lecturer lecturer1 = new Lecturer("L001", "Dr. John Smith", 
                                          "Computer Science", 4, 2500.0);
        LabAssistant assistant1 = new LabAssistant("A001", "Ms. Jane Doe",
                                                   "Physics Lab", 120, 18.5);
        
        System.out.println("\nLecturer Bonus: $" + 
               UniversityPolicy.calculateBonus(lecturer1.calculateMonthlyPayment()));
        System.out.println("Lab Assistant Bonus: $" + 
               UniversityPolicy.calculateBonus(assistant1.calculateMonthlyPayment()));
    }
}
