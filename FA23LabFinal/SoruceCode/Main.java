public class Main {
    public static void main(String[] args) {
        // Create participants
        Participant student1 = new Student("Alice");
        Participant student2 = new Student("Bob");

        // Create a case manager
        CaseManager caseManager = new CaseManager();

        // Create a new case
        Case case1 = caseManager.createCase();

        // Assign participants to the case
        caseManager.assignCase(case1, student1);
        caseManager.assignCase(case1, student2);

        // Resolve the case
        caseManager.resolveCase(case1);

        // Get all cases
        List<Case> allCases = caseManager.getAllCases();
        System.out.println("All Cases: " + allCases.size());
    }
}
