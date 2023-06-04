
public class Clothe {
    private String name;
    private String category;
    private String size;
    private String color;
    private float price;

    public Clothe(String kname, String kcategory, String ksize, String kcolor, float kprice) {
        SetValue(kname, kcategory, ksize, kcolor, kprice);
        getValues();
    }


    private void SetValue(String kname, String kcategory, String ksize, String kcolor, float kprice) {
        name = kname;
        category = kcategory;
        size = ksize;
        color = kcolor;
        price = kprice;
    }

    private void getValues() {
        System.out.println("Назва: " + name + "; Категорія: " + category + "; Розмір: " + size + "; колір: " + color + "; ціна: " + price);
    }

    public float Get_price() {

        return price;
    }

    public String Get_name() {

        return name;
    }

    public String Get_category() {

        return category;
    }

    public String Get_size() {

        return size;
    }

    public String Get_color() {

        return color;
    }
}