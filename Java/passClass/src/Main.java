import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);
    static double math, phy, chem, tr, his, music;

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
        System.out.print("Please Enter Music Grade : ");
        music = scanner.nextInt();

        double avg = ((math + phy + chem + tr + his + music) / 6);

        if(avg > 55 ){
            System.out.println("PASSED");
        }else
            System.out.println("Failed");
    }

    public static void main(String[] args) {
        calculateAvarage();
    }
}
