public class Student {
    private String name, id;
    private double gpa;

    public Student() {
        name = "Null";
        id = "Null";
        gpa = 0.0;
    }

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student Details" +
                "\nName =" + name + "\nID =" + id +
                "\nGPA =" + gpa + "\n";
    }
}
