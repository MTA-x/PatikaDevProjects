import java.util.Scanner;

public class Main {

    public static void calculateAvarage() {
        Scanner scanner = new Scanner(System.in);
        double math, phy, chem, tr, his, music;

        System.out.print("Please Enter Math Grade : ");
        math = scanner.nextInt();
        System.out.print("Please Enter Physics Grade : ");
        phy = scanner.nextInt();
        System.out.print("Please Enter Chemistry Grade : ");
        chem = scanner.nextInt();
        System.out.print("Please Enter Turkish Grade : ");
        tr = scanner.nextInt();
        System.out.print("Please Enter History Grade : ");
        his = scanner.nextInt();
        System.out.println("Please Enter Music Grade : ");
        music = scanner.nextInt();

        double avg = ((math + phy + chem + tr + his + music) / 6);

        boolean pass = avg > 60;

        System.out.print((pass) ? "Classes Passed : " : " Casses Failed : " + avg);
    }

    public static void main(String[] args) {
        calculateAvarage();
    }
}