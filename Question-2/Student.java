package com.company;

public class UnderGraduate extends Student {
    private int year;

    public UnderGraduate() {
        super();
        year = 0;
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
        return "UnderGraduate{" +
                "year=" + year +
                '}'+"\nName =" + super.getName() + "\nID =" + super.getId() +
                "\nGPA =" + super.getGpa() + "\n";
    }
}
