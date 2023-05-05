import java.util.Scanner;
import java.lang.StringBuilder;
public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        int index = 0;
        while (index < sb.length()) {
            char ch = sb.charAt(index);
            if (ch == '.' || ch == '?' || ch == '!') {
                sb.setCharAt(index, '|');
            }
            index++;
        }
        String[] sentences = sb.toString().split("\\|");// Розбиваємо текст на речення

        for (String sentence : sentences) {
            int start = sentence.indexOf('к');
            int end = sentence.lastIndexOf('к');
            if (start != -1 && end != -1) {
                String substring = sentence.substring(start, end + 1);
                sentence = sentence.replace(substring, "");
            }
            System.out.println(sentence);
        }

    }
}

