import java.util.Scanner;

public class Main {
    public static int ans;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        do {
            System.out.println("---------------------");
            System.out.println("* 1) ADD            *");
            System.out.println("*                   *");
            System.out.println("* 2) SUBTRACT       *");
            System.out.println("*                   *");
            System.out.println("* 3) DIVIDE         *");
            System.out.println("*                   *");
            System.out.println("* 4) MULTIPLY       *");
            System.out.println("*                   *");
            System.out.println("* 5) EXIT           *");
            System.out.println("---------------------");

            System.out.print("WHICH OPERATION WOULD YOU LIKE TO USE : ");
            ans = scanner.nextInt();

            switch (ans) {
                case 1:
                    addScreen.main();
                    break;
                case 2:
                    subtractScreen.main();
                    break;
                case 3:
                    divideScreen.main();
                    break;
                case 4:
                    multiplyScreen.main();
                    break;
                case 5:
                    exitProgram.displayExit();
                    break;
                default:
                    invalidChoice.displayInvalidChoice();
                    break;
            }

        } while (ans != 5);
    }
}