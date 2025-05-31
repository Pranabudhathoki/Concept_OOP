public class Employeeeeee {
    private String name;
    private String employeeId;
    private double salary;

    public Employeeeeee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
            System.out.println("Salary updated by " + amount);
        } else {
            System.out.println("Invalid salary update. Salary cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("DADA", "Archeticture", 5000000);
        System.out.println("Current salary: " + emp.getSalary());
        emp.updateSalary(6000000);
        System.out.println("After raise: " + emp.getSalary());
        emp.updateSalary(-2000000); 
        System.out.println("After invalid decrease: " + emp.getSalary());
    }
}