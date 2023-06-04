import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Створення 5 екземплярів класу Clothe
        System.out.println("Екземпляри класа: ");
        Clothe el1 = new Clothe("Сукня", "Верхній одяг", "M", "Червоний", 99.99f);
        Clothe el2 = new Clothe("Футболка", "Верхній одяг", "S", "Синій", 19.99f);
        Clothe el3 = new Clothe("Штани", "Низ", "L", "Чорний", 49.99f);
        Clothe el4 = new Clothe("Сорочка", "Верхній одяг", "XL", "Білий", 79.99f);
        Clothe el5 = new Clothe("Шапка", "Аксесуар", "One Size", "Зелений", 9.99f);
        // Створюємо масив з елементів класа
        Clothe[] array = new Clothe[]{el1, el2, el3, el4, el5};


        // Сортування за ціною в порядку спадання
        System.out.println("----------------------------------------" +
                "\nСортування за \"ціною\" в порядку спадання:");
        Arrays.sort(array, Comparator.comparingDouble(Clothe::Get_price).reversed());

        // Виведення відсортованого масиву
        for (Clothe clothe : array) {
            System.out.println("Назва: " + clothe.Get_name() + "; Категорія: " + clothe.Get_category() + "; Розмір: " + clothe.Get_size() +
                    "; колір: " + clothe.Get_color() + "; ціна: " + clothe.Get_price());
        }

        // Сортування за полем "назва" в алфавітному порядку
        System.out.println("----------------------------------------" +
                "\nСортування за полем \"назва\" в алфавітному порядку:");

        Arrays.sort(array, Comparator.comparing(Clothe::Get_name));
        // Виведення відсортованого масиву
        for (Clothe clothe : array) {
            System.out.println("Назва: " + clothe.Get_name() + "; Категорія: " + clothe.Get_category() + "; Розмір: " + clothe.Get_size() +
                    "; колір: " + clothe.Get_color() + "; ціна: " + clothe.Get_price());
        }
    }
}
