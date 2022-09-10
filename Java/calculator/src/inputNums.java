import java.util.Scanner;
import java.lang.Thread;

public class inputNums {

    public static Scanner scanner1 = new Scanner(System.in);
    public static Scanner scanner2 = new Scanner(System.in);
    public static int num1, num2;

    public static void displayScreen() throws InterruptedException {
        System.out.print("PLEASE ENTER FIRST NUMBER : ");
        Thread.sleep(1000);
        num1 = scanner1.nextInt();
        System.out.print("PLEASE ENTER SECOND NUMBER : ");
        Thread.sleep(1000);
        num2 = scanner2.nextInt();

        System.out.println("------------------------");
        System.out.println("The Sum Is " + calculateScreen());
        System.out.println("------------------------");
        Thread.sleep(5000);

    }

    public static int calculateScreen() {
        if (Main.ans == 1) {
            return num1 + num2;
        } else if (Main.ans == 2) {
            return num1 - num2;
        } else if (Main.ans == 3) {
            return num1 / num2;
        } else
            return num1 * num2;
    }
}