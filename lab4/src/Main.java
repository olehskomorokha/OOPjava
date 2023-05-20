import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Екземпляри класа: ");
        clothe el1 = new clothe("Сукня", "Верхній одяг", "M", "Червоний", 99.99f);
        clothe el2 = new clothe("Футболка", "Верхній одяг", "S", "Синій", 19.99f);
        clothe el3 = new clothe("Штани", "Низ", "L", "Чорний", 49.99f);
        clothe el4 = new clothe("Сорочка", "Верхній одяг", "XL", "Білий", 79.99f);
        clothe el5 = new clothe("Шапка", "Аксесуар", "One Size", "Зелений", 9.99f);
        clothe[] array = new clothe[]{el1, el2, el3, el4, el5};


        // Сортування за ціною в порядку спадання
        System.out.println("----------------------------------------" +
                "\nСортування за \"ціною\" в порядку спадання:");
        Arrays.sort(array, Comparator.comparingDouble(clothe::Get_price).reversed());

        // Виведення відсортованого масиву
        for (clothe clothe : array) {
            System.out.println("Назва: " + clothe.Get_name() + "; Категорія: " + clothe.Get_category() + "; Розмір: " + clothe.Get_size() +
                    "; колір: " + clothe.Get_color() + "; ціна: " + clothe.Get_price());
        }

        // Сортування за полем "назва" в алфавітному порядку
        System.out.println("----------------------------------------" +
                "\nСортування за полем \"назва\" в алфавітному порядку:");
        Arrays.sort(array, Comparator.comparing(clothe::Get_name));
        // Виведення відсортованого масиву
        for (clothe clothe : array) {
            System.out.println("Назва: " + clothe.Get_name() + "; Категорія: " + clothe.Get_category() + "; Розмір: " + clothe.Get_size() +
                    "; колір: " + clothe.Get_color() + "; ціна: " + clothe.Get_price());
        }
    }
}
