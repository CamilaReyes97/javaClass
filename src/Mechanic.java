
public class Mechanic extends Employee {
    private String specialization;

    public Mechanic(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public void displaySpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}
