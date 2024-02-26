package Excercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
    }
}

class Swap {
    // swapping 2 numbers using temporary variable
    public static void main(String[] args) {
        numberSwap();
    }
    public static void numberSwap() {
        int n1 = 4, n2 = 5;
        System.out.println("Before swapping: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}

    /* Write a program called CheckPassFail which prints "PASS" if
    the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.
    The program shall always print “DONE” before exiting.
     */

class Mark {
    public static void main(String[] args) {
        checkPassFail();
    }
    public static void checkPassFail() {
            Scanner mark;
            mark = new Scanner(System.in);

            try {
                System.out.println("Select your mark: ");
                int userMark = mark.nextInt();

                if (userMark >= 50) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                }
                System.out.println("DONE");
            } catch (Exception notInt) {
                System.err.println("Input needs to be int.");
            }
        }
    }

    /*
    Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
    or “Even Number” otherwise. The program shall always print “bye!” before exiting.
     */

class EvenOdd {
    public static void main(String[] args) {
        evenOdd();
    }
    public static void evenOdd() {
        System.out.println("Pick an int: ");
        Scanner userInput;
        userInput = new Scanner(System.in);
    try {
        int userNumber = userInput.nextInt();
        System.out.println("Your number is " + userNumber);

        if ((userNumber % 2) == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    } catch (Exception notInt) {
        System.err.println("Input needs to be int.");
    }
        System.out.println("Bye!");
    }
}
/*
„Ping Pong“
Postupně vypisovat čísla od čísla zadaného uživatelem do čísla zadaného uživatelem
Místo násobků 3 napsat Ping
Místo násobků 5 napsat Pong
V případě násobků obojího, napsat PingPong

 */

class PingPong {
    public static void main(String[] args) {
        int[] numbers = userInput();
        conditionsPingPong(numbers[0], numbers[1]);

    }
    public static int[] userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.println("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        return new int[]{startNumber, endNumber};
    }

    public static void conditionsPingPong(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("PingPong");
            } else if (i % 5 == 0) {
                System.out.println("Pong");
            } else if (i % 3 == 0) {
                System.out.println("Ping");
            } else {
                System.out.println(i);
            }
        }
    }
}


/*
Zadefinujte si pole celých čísel, které bude vypadat následovně
int[] pole = {3,5,8,11,36,69,34,5,90,6,3,6534,8,575,234}
Ke každému číslu v poli přičtěte dvojnásobek hodnoty.
Vypište všechny výsledky do konzole
 */

class Cycle {
    public static void main(String[] args) {cycle();}
        public static void cycle() {
            int[] pole = {3, 5, 8, 11, 36, 69, 34, 5, 90, 6, 3, 6534, 8, 575, 234};
            for (int i:pole) {
                int upgradePole = i*2;
                System.out.println(upgradePole);
            }
        }
    }

    /*
    The task is to write a function that calculates the factorial of a given number.
    The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
    It is denoted by n!.
     */

class Factorial {
    public static void main(String[] args) {factorial();}
        public static void factorial() {
            System.out.println("Zadejte číslo, které chcete převést na faktoriál: ");
            Scanner userInput;
            userInput = new Scanner(System.in);
            int numberInput = userInput.nextInt();

            int f = 1;
            for (int i=1; i<=numberInput; i++) {
                f=f*i;
                //f=1*5
                //f=1*4
                //f=1*3
                //f=1*2
                //f=1*1
            }
            System.out.println("Factorial of your number is : " + f);
        }

}


/*
Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER"
if the int variable "number" is 1, 2,... , 9, or other, respectively.
Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
 */

class NumbersWords {
    public static void main(String[] args) {
        PrintNumberInWord();
    }

    public static void PrintNumberInWord() {
        Scanner userInput;
        System.out.println("Choose a number: ");
        userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        switch (number) {
            case 1:
                System.out.println("ONE"); break;
            case 2:
                System.out.println("TWO"); break;
            case 3:
                System.out.println("THREE"); break;
            case 4:
                System.out.println("FOUR"); break;
            case 5:
                System.out.println("FIVE"); break;
            case 6:
                System.out.println("SIX"); break;
            case 7:
                System.out.println("SEVEN"); break;
            case 8:
                System.out.println("EIGHT"); break;
            case 9:
                System.out.println("NINE"); break;
            case 10:
                System.out.println("TEN"); break;
            default:
                System.out.println("some other number.");
        }
    }
}

/*
Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday”
if the int variable "dayNumber" is 0, 1, ..., 6, respectively.
Otherwise, it shall print "Not a valid day". Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.
 */

class PrintDayInWord {
    public static void main(String[] args) {
        printDayInWord();
    }

    public static void printDayInWord() {
        while (true) {
            System.out.println("Type in some day in a week as a number: ");
            Scanner Day;
            Day = new Scanner(System.in);
            try {
                int weekDay = Day.nextInt();
                switch (weekDay) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuedsay");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                break;
            } catch (Exception notInt) {
                System.err.println("This is not a number. Try again");
            }
        }
    }
}



