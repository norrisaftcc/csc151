import java.util.Scanner;

public class Demo {

    public static int roll() {
        // roll a die, return from 1 to 6
        // for now just pretend
        return 1;
    }
    public static void main (String[] args) {
        System.out.println("Hey, what's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println();
        System.out.println("Nice to meetcha, " + name);
        int chips = 100;
        System.out.println("Well," + name + " you start with " + chips + " chips.");
        System.out.println();
        System.out.println("Rolling the 🎲 dice... ");
        int roll = roll();
        System.out.println("You rolled a: " + roll);
    }

}