/*
JDK - Java Development Kit = sada nástrojů pro vývoj java aplikací
JRE - Java Runtime Environment = je potřeba pro spuštění Java aplikací, obsahuje JVM a
knihovní funkce, hlídač aktualizací
JVM - Java Virtual Machine = virtuální stroj, který pouští Java bytecode (to, co vyplivne compiler)

Java Source File (zdrojový kód, který napíši)
-> Java Compiler (prožene se to kompilerem, příkaz JavaC)
-> vyplivne to Java Class File = binární soubory, binární data, která se předhazují JVM
-> Java Virtual Machine = vezme si binární data a přechroupe je operačnímu systému, aby to fungovalo

IDE = Integrated Development Environment
- usnadňuje nám práci při psaní kódu
- združuje několik nástrojů do jednoho balíčku
- zvýrazňuje kód, napovídá, kontroluje správnost
 */

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
    }
}

class PrintAscii {
    public static void main(String[] args) {printAscii();}
    public static void printAscii() {
            String asciiArt =
                    """
                              22       NN     NN\s
                            22  22     NNN    NN\s
                               22      NN  N  NN\s
                              22       NN   N NN\s
                            2222222    NN    NNN\s
                              """;
            System.out.println(asciiArt);
    }
}

class Variables {
    public static void main(String[] args) {variables();}
    public static void variables() {
            int a = 5; // deklaruji proměnnou
            int b = 3;
            System.out.println(a + b);

            a = 9; // přiřazuji hodnotu proměnné
            System.out.println(a);

            int result;
            result = a - b;
            System.out.println(result);

            result = a * b;
            System.out.println(result);

            result = a / b;
            System.out.println(result);

            int s = 11;
            int t = 7;
            double st = (double) s / (double) t;
            System.out.println((st));

            long c = 3000000000000L;
            double d = 4.00002;
        }
    }

class Scanner1 {
    public static void main(String[] args) {scanner();}
    public static void scanner() {
        Scanner sc;
        sc = new Scanner(System.in); // instance třídy scanner
        System.out.println("Zadej první číslo: ");

        double a = sc.nextDouble(); // tzn. vyčti mi od uživatele nějaký další jeho vstup a zpracuj ho jako číslo, co může mít desetinnou tečku
        System.out.println("Tvoje číslo je: ");
        System.out.println(a);
    }
}

class Scanner2 {
    public static void main(String[] args) {scanner2();}
    public static void scanner2() {
        Scanner sc2;
        sc2 = new Scanner(System.in);
        try {
            System.out.println("Zadej první číslo: ");
            int a = sc2.nextInt();

            System.out.println("Zadej druhé číslo: ");
            int b = sc2.nextInt();

            int result = a + b;

            System.out.println("Výsledek součtu prvního a druhého čísla je: " + result);
        } catch (Exception ex) {
            System.err.println("Zadal jsi nevalidní vstup.");
        }
    }
}

class Datafield {
    public static void main(String[] args) {datafield();}
    public static void datafield() {
        int a = 5;
        int[] data = new int[10]; // int[] data = pouze nuly, new int[10] = 10 pozic plné nul
        // [0,0,0,0,0,0,0,O,0,0]

        data[2] = 101;

        System.out.print("Hodnota data je: ");
        System.out.println(data[2]);

        System.out.println("Délka pole 'data' je: ");
        System.out.println(data.length);
    }
}

class Loops {
    public static void main(String[] args) {loops();}
    public static void loops() {
        boolean condition = true;

        if (!condition) {
            System.out.println("Podmínka je true.");
        } else {
            System.out.println("Podmínka je false.");
        }
    }
}

class Loops2 {
    public static void main(String[] args) {
        loops2();
    }

    public static void loops2() {
        Scanner loops;
        loops = new Scanner(System.in);
        try {
            System.out.println("Zadejte celé číslo: ");
            int input = loops.nextInt();

            if (input > 10) {
                System.out.println("Trefili jste se do čísla.");
            } else {
                System.out.println("Bohužel jste se netrefili. Hodně štěstí příště.");
            }

        } catch (Exception ex) {
            System.err.println("Nezadali jste celé číslo. Zkuste to znovu.");
        }
    }
}

class Loops3 {
    public static void main(String[] args) {
        loops3();
    }
    public static void loops3() {
        Scanner userInput;
        userInput = new Scanner(System.in);

        try {
            System.out.println("Zadejte celé číslo dle Vašeho výběru: ");
            int input = userInput.nextInt();
            double number = ((double) (3 * 7 * 5) /3);

            if (input > number) {
                System.out.println("Vaše číslo je větší než výsledek matematické operace ((3*7*5)/3).");
            } else {
                System.out.println("Vaše číslo je menší než výsledek matematické operace ((3*7*5)/3).");
            }
        } catch (Exception e) {
            System.err.println("Zadejte prosím celé číslo.");
        }
    }

static class Loops4 {
    public static void main(String[] args) {
        forloop();
    }
}
    public static void forloop() {
        int[] data = {11, 2, 4, 5, 6, 9};
        System.out.println(data.length);

        for (int datum : data) {
            System.out.println(datum);
        }
    }
}

// int i = 0 (deklarujeme, že začínáme od nuly)
// i < data.length (deklarujeme, že for loop pojede, dokud je i menší než délka pole)
// i++ (použitá operace => přičítáme 1 a to budeme dělat tak dlouho, dokud je i menší než délka pole)
// i++ = i=i+1

/*
psvm zkratka -> vygeneruje public static void main
vstupní bod kódu je public class Main

Proměnné:

Datové typy:
byte = velikost 1 byte = celé číslo v rozsahu -128 - 127
short = veliksot 2 bytes = celé číslo v rozsahu -32, 768 - 32, 767
int = velikost 4 bytes = celé číslo v rozsahu -2, 147, 483, 648 - 2, 147, 483, 647
long = velikost 8 bytes = celé číslo v rozsahu -9, 223, 372, 036, 854, 775, 808 - 9, 223, 372, 036, 854, 775, 807
float = velikost 4 bytes = desetinná čísla, použití pro 6-7 cifer
double = velikost 8 bytes = desetinná čísla, použití pro 15 cifer
boolean = velikost 1 bit = hodnoty True / False
char = velikost 2 bytes = jeden znak / písmeno
string = velikost N = ukládání textu

ctrl+alt+l = reformat code
ctrl+shift+a = run anything
double shift = find anything
 */
