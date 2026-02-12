import java.util.Scanner;

public class file{
    public static void main(String[] args) {
        // Your code goes here
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = keyboard.nextLine();

        System.out.println("Hello " + username);

        System.out.println("I'm not very good at Java!");

        keyboard.close();
    }
}
