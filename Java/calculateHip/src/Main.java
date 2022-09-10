import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        double x , y , z , u;
        double alan , cevre;


        System.out.print("Please Enter First Value : ");
        x = value.nextDouble();

        System.out.print("Please Enter First Value : ");
        y = value.nextDouble();

        System.out.print("Please Enter First Value : ");
        z = value.nextDouble();

        u = (x + y +  z) / 2;
        cevre = (2 * u);
        alan = Math.sqrt(u * ( (u - x) * (u - y) * (u - z) ) );

        System.out.println("Üçgenin Çevresi : " +cevre + " cm ");

        System.out.print("Üçgenin Alanı : " + alan + " cm2");
    }
}