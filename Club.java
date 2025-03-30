import java.util.ArrayList;

public class Club {
    private String name;
    private String type;
    private ArrayList<Student> members;
    private ArrayList<Event> events;

    public Club(String name, String type) {
        this.name = name;
        this.type = type;
        this.members = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Student> members) {
        this.members = members;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
    public void addMember(Student student) {
        members.add(student);
    }
    public void organizeEvent(Event event) {
        events.add(event);
    }
}
