

import java.util.HashMap;


public class Main {
    private static String analyzedData = "Регулярные выражения — тема, котёрую котЁрую  котёрую программисты, даже опытные," +
            " зачастую откладывают на потом. Однако большинству Java-разработчиков рано или поздно придётся столкнуться с" +
            " обработкой текстовой информации. Чаще всего — с операциями поиска в тексте и редактированием." +
            " Без регулярных выражений продуктивный и компактный программный код, связанный с обработкой текстов," +
            " попросту немыслим. Так что хватит откладывать, разберёмся с «регулярками» прямо сейчас." +
            " Это не такая уж и сложная задача.";
    private static final String format = "|%1$-40.38s|%2$-30.28s|\n";
    private static final HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        analyzedData = analyzedData.replaceAll("[^A-Za-zА-ЯЁа-яё0-9 ]", " ").toLowerCase();
        analyzedData = analyzedData.replaceAll("[\\s]{2,}", " "); // удаляю оставшиеся лишние пробелы
        String[] regularArray = analyzedData.split(" ");                // Создаю массив слов из большой строки...
        System.out.println("Задание №1");
        System.out.println("Обрабатываемый фрагмент текста имеет " + regularArray.length + " слов.");

        for (String s : regularArray) {
            hashMap.putIfAbsent(s, 0);
            hashMap.put(s, hashMap.get(s) + 1);
        }
        System.out.println("Таблица результатов анализа текста");
        System.out.println("_________________________________________________________________________");
        System.out.format(format, "         слово / фраза", " Количество повторений");
        System.out.println("=========================================================================");
        hashMap.entrySet().stream().sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed()).forEach(stringIntegerEntry -> {
            String k = stringIntegerEntry.getKey();
            Integer v = stringIntegerEntry.getValue();
            System.out.format(format, " " + k + " ", "   " + +v + " раз.");
        });
        System.out.println("-------------------------------------------------------------------------");

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
        // запрашиваем результаты
        pB.get("Петров");
        pB.get("Иванов");
        pB.get("Сидоров");
    }
}