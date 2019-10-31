
public class TestOfQuestion_2 {

    public static void main(String[] args) {
    //Testing of Student Class
        Student s1 = new Student();
        System.out.println(s1.toString());
        Student s2 = new Student("Name 2", "Test id 2", 3.99);
        System.out.println(s2.toString() + "\n");

        //Testing of Undergraduate Class driven from Student Class
        UnderGraduate ug1 = new UnderGraduate(2013, "Ali", "FA18-bcs-206", 3.9);
        System.out.println(ug1.toString());

        //Testing of Graduate Class driven from Student Class
        Graduate g1 = new Graduate();
        g1.setThesisTitle("Student of Computer Sciences");
        g1.setName("Hamza");
        g1.setId("FA18-BCS-111");
        g1.setGpa(3.15);
        System.out.println(g1.toString());
        }
        }
