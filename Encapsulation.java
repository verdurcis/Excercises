public class Encapsulation {
    public static void main(String[] args) {
        Lasagna portion = new Lasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
        portion.eatLasagna();
        System.out.println(portion);
    }
}

class Lasagna {
    private int amount = 10;
    public Lasagna() {
        prepareLasagna();
    }
    private void prepareLasagna() {
        System.out.println("Preparing " + this.amount + " servings of lasagna.");
    }

    private void serveLasagna() {
        if (amount <= 0) {
            System.out.println("Portion of lasagna cannot be served.");
        } else {
            System.out.println("Serving 1 portion of lasagna.");
        }
    }

    public void eatLasagna( ) {
        serveLasagna();
        if (amount <= 0) {
            System.out.println("There is no lasagna left. Order something else.");
        } else {
            amount = amount - 1;
            System.out.println("You have eaten lasagna.");
        }
    }

    @Override
    public String toString() {
        return "You have " + amount + " of lasagna left.";
    }
}

// TODO do not allow eating lasagna if the amount is 0, write some message