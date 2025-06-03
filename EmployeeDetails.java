//Adheres to single responsibility as one class is performing one specific function which is getting employee details.
public class EmployeeDetails {
    private String name;
    private String position;

    public EmployeeDetails(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails("Alice Johnson", "Software Engineer");

        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
    }
}

