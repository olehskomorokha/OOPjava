//Тип
//StringBuilder
//дію з рядком:
//З кожного речення заданого тексту видалити підрядок найбільшої
//довжини, що починається та закінчується заданими літерами.

import java.util.Scanner;
import java.lang.StringBuilder;

public class lab3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text); // Створюється об'єкт StringBuilder з текстом який раніше ввели
        int index = 0;
        while (index < sb.length()) { // Циклом перевіряємо кожний елемент тексту
            char ch = sb.charAt(index);
            if (ch == '.' | ch == '?' | ch == '!') { // перевіряємо чи є в тексі ".", '?', '!'
                sb.setCharAt(index, '|');//Якщо символ є одним з вказаних, то змінюється на символ | за допомогою методу setCharAt(index, '|').
            }
            index++;
        }
        String[] sentences = sb.toString().split("\\|");// Розбиваємо текст на речення

        for (String sentence : sentences) { // цикл for перебирає кожне речення з масиву sentences.
            int start = sentence.indexOf('к');// перше входження символу 'к' за допомогою методу indexOf('к') та останнє'к' за допомогою методу lastIndexOf('к').
            int end = sentence.lastIndexOf('к');
            if (start != -1 && end != -1) { //Якщо обидва символи знайдені, то створюється підрядок, що починається з першого входження 'к' і закінчується останнім входженням 'к'.
                String substring = sentence.substring(start, end + 1);
                sentence = sentence.replace(substring, "");
            }
            System.out.println(sentence);
        }

    }
}