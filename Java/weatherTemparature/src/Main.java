import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        if (5 <= temperature && temperature <= 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (10 < temperature && temperature < 25) {
            int choice;
            System.out.print("1-Açık alan mı?\n2-Kapalı alan mı?\nSeçiminiz:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Piknik yapmaya gidebilirsiniz");
                    break;
                case 2:
                    System.out.println("Sinemaya gidebilirsiniz.");
                    break;
            }
        }
        if (25 < temperature) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}