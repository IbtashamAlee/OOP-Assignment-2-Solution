

public class UnderGraduate extends Student {
    private int year;

    public UnderGraduate() {
        year = 0;
        super.setName("Null");
        super.setId("Null");
        super.setGpa(0.0);
    }

    public UnderGraduate(int year) {
        this.year = year;
    }

    public UnderGraduate(int year, String name, String id, double gpa) {
        super(name, id, gpa);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Detail of UnderGraduate Student \n" +
                "Year :" + year + "\nName =" + super.getName() + "\nID =" + super.getId() +
                "\nGPA =" + super.getGpa() + "\n";
    }
}
