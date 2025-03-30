import java.util.ArrayList;

public class SmartCampusSystem {
    ArrayList<Student>students;
    ArrayList<Club>clubs;
    ArrayList<Event>events;
    ArrayList<Service>services;

    public SmartCampusSystem() {
        students = new ArrayList<Student>();
        clubs=new ArrayList<Club>();
        events=new ArrayList<Event>();
        services=new ArrayList<Service>();

    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addClub(Club club) {
        clubs.add(club);
    }
    public void addEvent(Event event) {
        events.add(event);
    }
    public void addService(Service service) {
        services.add(service);
    }

}
