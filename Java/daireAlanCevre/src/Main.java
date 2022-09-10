import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r , a;
        double pi = 3.14, vAlan;

        Scanner input = new Scanner(System.in);


        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz : ");
        a = input.nextInt();

        vAlan = (pi*( r * r )* a)/360;
        System.out.println("Dairenin Diliminin Alanı : " + vAlan);
    }
}