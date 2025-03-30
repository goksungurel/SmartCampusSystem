public class Gym extends Service{
    private int activeUsers;

    public Gym(String name,String location,int activeUsers) {
        super(name,location);
        this.activeUsers = activeUsers;
    }
    void useService(Student student) {
        activeUsers++;
        System.out.println(student.getName() + " is using the gym: " + getName());
    }

}
class Library extends Service{
    private int availableSeats;
    public Library(String name,String location,int availableSeats) {
        super(name,location);
        this.availableSeats = availableSeats;
    }
    void useService(Student student) {
        if(availableSeats>0) {
            availableSeats--;
        }
        System.out.println(student.getName() + " is using the library: " + getName());
    }
}
class Cafeteria extends Service{
    private int dailyMealLimit;
    public Cafeteria(String name,String location,int dailyMealLimit) {
        super(name,location);
        this.dailyMealLimit = dailyMealLimit;

    }
    void useService(Student student) {
        if(dailyMealLimit>0) {
            dailyMealLimit--;
            System.out.println(getName() + " is using the cafeteria: " + getName());

        }
    }
}
