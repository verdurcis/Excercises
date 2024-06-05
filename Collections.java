import java.util.*;

public class Collections {
    public static void main(String[] args) {
        oldArraySolution();
        arrayList();
        linkedList();
        set();
        map();
    }

    private static void map() {
        Map<String, String> translations = new HashMap<>();
        translations.put("Lasagna", "Lasagně");
        translations.put("Stone", "Kámen");

        for (String item : translations.keySet()) {
            System.out.println(STR."\{item} translates to \{translations.get(item)}");
            //(item + " translates to " + translations.get(item))
        }
        // MAPA = hodnoty na základě unikátních klíčů
        // MAPA = nedodržuje pořadí
    }

    private static void set() {
        Set<String> numbers = new HashSet<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Three");
        // SET = dva prvky nemohou být v setu více nežli jednou a když ano, printne jen jeden
        // SET = pytel, nedodržuje pořadí prvků
    }

    private static void linkedList() {
        List<String> greetings = new LinkedList<>();
        greetings.add("Hello");
        greetings.add("Hi");
        // LINKED = je dobrý, když chci přidávat / řetězit / hodně měnit rozsah
    }

    private static void arrayList() {
        List<String> numbers = new ArrayList<>();
        numbers.add("Three");
        numbers.add("Ten");
        numbers.add("Eleven");

        for (String element : numbers) {
            System.out.println(element);
        }
    }

    private static void oldArraySolution() {
        String[] numbers = new String[10];
        numbers[2] = "Three";
        numbers[9] = "Ten";
        printAllNumbers(numbers);

        String[] newNumbers = new String[numbers.length*2];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        // for (int i = 0; i < numbers.length; i++) {newNumbers[i] = numbers[i];}


        printAllNumbers(newNumbers);
        // -----------------------
        numbers = newNumbers;
        numbers[10] = "Eleven";
        printAllNumbers(numbers);
    }

    private static void printAllNumbers(String[] numbers) {
        for (String number : numbers) {
            //int i = 0; i < numbers.length; i++
            System.out.println(number);
        }
    }
}

