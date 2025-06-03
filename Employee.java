//Code that violates the single reponsibility principle. The same class has a variety of different functions.
public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
    }

    public void saveToDatabase() {
        // Simulate saving to a database
        System.out.println("Saving employee to database...");
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Alice Johnson", "Software Engineer");
        employee.printDetails();
        employee.saveToDatabase();
    }

}

