package com.company;

public class Graduate extends Student {
    private String thesisTitle;

    public Graduate() {
        super();

    }

    public Graduate(String thesisTitle, String name, String id, double gpa) {
        super(name, id, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "thesisTitle='" + thesisTitle + '\'' +
                '}'+"\nName =" + super.getName() + "\nID =" + super.getId() +
                "\nGPA =" + super.getGpa() + "\n";
    }
}
