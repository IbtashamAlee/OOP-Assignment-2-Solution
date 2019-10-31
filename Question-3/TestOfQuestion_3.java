        
public class TestOfQuestion_3{

    public static void main(String[] args) {
        //Testing of WeighedItem class driven from PurchaseItem
        WeighedItem w1 = new WeighedItem();
        w1.setName("Rice");
        w1.setWeight(3);
        w1.setUnitPrice(20);
        System.out.println(w1.toString());

        //Testing of CountedItem class driven from PurchaseItem
        CountedItem c1 = new CountedItem("Pen", 25, 4);
        System.out.println(c1.toString());
        }
