import java.util.ArrayList;
import java.util.List;

// Participant interface
interface Participant {
    void receiveMessage(Message message);
}

// Student class implementing Participant interface
class Student implements Participant {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(Message message) {
        System.out.println(name + " received message: " + message.getContent());
    }
}

// Case class
class Case {
    private List<Participant> assignedParticipants = new ArrayList<>();

    public void assignParticipant(Participant participant) {
        assignedParticipants.add(participant);
    }

    public void resolve() {
        // Implement case resolution...
        // You might want to update the case status, notify stakeholders, etc.
        System.out.println("Case resolved.");
    }
}

// CaseManager class
public class CaseManager {
    private List<Case> cases = new ArrayList<>();

    public Case createCase() {
        Case newCase = new Case();
        cases.add(newCase);
        return newCase;
    }

    public void assignCase(Case aCase, Participant participant) {
        aCase.assignParticipant(participant);
        // You might want to perform additional logic here
        System.out.println("Case assigned to participant.");
    }

    public void resolveCase(Case aCase) {
        aCase.resolve();
        // You might want to perform additional logic here
        System.out.println("Case resolved.");
    }

    // Additional method to get all cases
    public List<Case> getAllCases() {
        return cases;
    }
}
