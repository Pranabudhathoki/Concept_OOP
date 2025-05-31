public class Employee {
    private String name;
    private String jobTitle;
    private double salary;


    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }


    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Pranab", "Software Engineer", 7500000);
        
        System.out.println("Initial salary: " + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println("After 10% raise: " + emp.getSalary());
        emp.updateSalary(8000000);
        System.out.println("After update: " + emp.getSalary());
    }
}