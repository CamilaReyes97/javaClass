
public class OfficeAdmin extends Employee {
    private String department;

    public OfficeAdmin(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayDepartment() {
        System.out.println("Department: " + department);
    }
}
