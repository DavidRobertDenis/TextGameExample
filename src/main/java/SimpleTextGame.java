
import java.util.Scanner;

public class SimpleTextGame {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean gameOver = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Text Adventure Game!");

        while (!gameOver) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    startGame();
                    break;
                case 2:
                    System.out.println("Thanks for playing! Goodbye.");
                    gameOver = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Start New Game");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void startGame() {
        System.out.println("\nWelcome to the game! Your adventure begins...");


        System.out.println("Congratulations! You completed the game.");
        System.out.println("Thanks for playing!");
    }
}