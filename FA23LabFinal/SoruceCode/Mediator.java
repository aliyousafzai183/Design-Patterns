import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Participant> participants = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void sendMessage(Message message, Participant sender) {
        for (Participant participant : participants) {
            if (participant != sender) {
                participant.receiveMessage(message);
            }
        }
    }

    public void broadcastMessage(Message message) {
        for (Participant participant : participants) {
            participant.receiveMessage(message);
        }
    }

    public void addAnnouncement(Announcement announcement) {
        broadcastMessage(new Message("Announcement: " + announcement.getContent()));
    }

    public void addSurvey(Survey survey) {
        broadcastMessage(new Message("Survey: " + survey.getContent()));
    }

    public void addPolling(Polling polling) {
        broadcastMessage(new Message("Polling: " + polling.getContent()));
    }

    public void notifyCompliance(Participant participant) {
        sendMessage(new Message("Compliance notification"), participant);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
