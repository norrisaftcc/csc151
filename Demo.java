import java.util.Scanner;

public class Demo {
    public static void main (String[] args) {
        System.out.println("Hey, what's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println();
        System.out.println("Nice to meetcha, " + name);
    }

}