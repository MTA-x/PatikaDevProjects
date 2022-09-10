import java.util.Scanner;
class calculateKDC {
    public static void main(String[]args){

        double kdvliFiyat,kdvsizFiyat, kdvOran , kdv;
        boolean kdvTutari;

        Scanner tutar = new Scanner(System.in);
        System.out.print("Ürün tutarını giriniz: ");
        kdvsizFiyat = tutar.nextInt();

        kdvTutari = (0 < kdvsizFiyat) && (1000 > kdvsizFiyat);
        kdvOran = kdvTutari ? 0.18d : 0.08d;

        kdv = kdvsizFiyat * kdvOran;
        kdvliFiyat = kdv + kdvsizFiyat;

        System.out.println("KDV miktarı: "+ kdv);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    }
}