import java.util.ArrayList;

public class Event {
    private String eventName;
    private String date;
    private Club hostClub;
    private ArrayList<Student> participants;

public Event(String eventName, String date, Club hostClub) {
    this.setEventName(eventName);
    this.setDate(date);
    this.setHostClub(hostClub);
    this.participants = new ArrayList<>();
}

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Club getHostClub() {
        return hostClub;
    }

    public void setHostClub(Club hostClub) {
        this.hostClub = hostClub;
    }

    public ArrayList<Student> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Student> participants) {
        this.participants = participants;
    }

    public void addParticipant(Student participant) {
    this.participants.add(participant);
    }

    public void printEventInfo() {
        System.out.println("Event: " + eventName + " on " + date);
        System.out.println("Host Club: " + hostClub.getName());
        System.out.println("Participants:");
        for (Student s : participants) {
            System.out.println("- " + s.getName());
        }
    }
}
