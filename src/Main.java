import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String myName;
        final int NUM = 13;
        String word = "Peace";

        myName = NUM + word;
        System.out.println(NUM);
        System.out.println(myName);
        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Number is negative");
        } else if (NUM > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }
}