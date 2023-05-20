
public class clothe {
    private String name;
    private String category;
    private String size;
    private String color;
    private float price;

    public clothe(String kname, String kcategory, String ksize, String kcolor, float kprice) {
        SetValue(kname, kcategory, ksize,kcolor, kprice);
        getValues();
    }


    private void SetValue(String kname, String kcategory, String ksize, String kcolor, float kprice) {
        this.name = kname;
        this.category = kcategory;
        this.size = ksize;
        this.color = kcolor;
        this.price = kprice;
    }
    private void getValues() {
        System.out.println("Назва: " + this.name + "; Категорія: " + this.category + "; Розмір: " + this.size + "; колір: " + this.color + "; ціна: " + this.price);
    }

    public float Get_price() {
        return this.price;
    }

    public String Get_name() {
        return this.name;
    }
    public String Get_category() {
        return this.category;
    }
    public String Get_size() {
        return this.size;
    }
    public String Get_color() {
        return this.color;
    }
}