public class clothe {

    public String size;
    public String color;
    public String Type;
    public String Brend;
    public float prise;

    public void SetValue(String _size, String _color, String _Type, String _Brend, float _Prise, int i) {
        size = _size;
        color = _color;
        Type = _Type;
        Brend = _Brend;
        prise = _Prise;
    }

    public String getValue(){
        String info = "Type: " + Type + "; Size: " + size + "; Color: " + color +"; Brend: " + Brend + "; Prise: " + prise;
        return info;
    }

}