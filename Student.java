import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private String department;
    private int creditPoints;
    private ArrayList<Club>joinedClubs;

    public Student(String id, String name, String department, int creditPoints) {
        this.id = id;
        this.setName(name);
        this.setDepartment(department);
        this.setCreditPoints(creditPoints);
        setJoinedClubs(new ArrayList<>());
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public ArrayList<Club> getJoinedClubs() {
        return joinedClubs;
    }

    public void setJoinedClubs(ArrayList<Club> joinedClubs) {
        this.joinedClubs = joinedClubs;
    }
    public void joinClub(Club club) {
        joinedClubs.add(club);
        club.addMember(this);
    }
    public void attendEvent(Event event) {
        event.addParticipant(this);
        creditPoints +=10;
    }
    public void useService(Service service) {
        service.useService(this);

    }
    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Credit Points: " + creditPoints);

        System.out.println("Joined Clubs:");
        for (Club club : joinedClubs) {
            System.out.println("- " + club.getName());
        }
    }


}
