import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        String[] words = {
                "киви", "банан", "вишня", "киви",
                "черешня", "банан", "вишня", "апельсин",
                "черешня", "мандарин", "лимон", "яблоко",
                "апельсин", "мандарин", "черешня", "абрикос",
                "вишня", "киви", "банан", "апельсин"
        };

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        PhoneBook pB = new PhoneBook();
        // заполняем справочник данными
        System.out.println("Задание №2 телефонный справочник");
        pB.add("Петров", "+7 (911) 322-22-23");
        pB.add("Иванов", "+7 (911) 444-44-44");
        pB.add("Петров", "+7 (911) 322-22-23");
        pB.add("Сидоров", "+7 (911) 555-55-55");
        pB.add("Андреев", "+7 (911) 666-69-69");
        pB.add("Петров", "+7 (911) 772-27-72");
        pB.add("Иванов", "+7 (911) 802-08-02");
        pB.add("Петров", "+7 (911) 999-09-90");
        System.out.println("Записи для фамилии Иванов: " + pB.get("Иванов"));
        System.out.println("Записи для фамилии Петров: " + pB.get("Петров"));
        System.out.println("Записи для фамилии Сидоров: " + pB.get("Сидоров"));
        System.out.println("Записи для фамилии Потапов: " + pB.get("Потапов"));
    }
}