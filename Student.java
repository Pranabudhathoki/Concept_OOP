public class Student {
    private String name;
    private String idNumber;
    private final double gpa;

    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public static void main(String[] args) {
        Student student = new Student("Pranab", "240355", 3.8);
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getIdNumber());
        System.out.println("GPA: " + student.getGpa());
        
        student.setName("Alice Smith");
        System.out.println("Updated name: " + student.getName());
    }
}