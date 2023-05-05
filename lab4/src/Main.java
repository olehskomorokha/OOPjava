public class Main {
    public static void main(String[] args) {
        clothe element1 = new clothe();
        element1.SetValue("43", "White", "Sneekers","Puma", 2450,44);
        String res1 = element1.getValue();
        System.out.println(res1);


        clothe element2 = new clothe();
        element2.SetValue("S", "Black", "T-short","adidas", 799,44);
        String res2 = element2.getValue();
        System.out.println(res2);

        clothe element3 = new clothe();
        element3.SetValue("XS", "Black", "Pants","adidas", 899,44);
        String res3 = element3.getValue();
        System.out.println(res3);

    }
}
