import java.util.Scanner;

class manavKasa {

    /**
     * @author MTA
     */

    public static void main(String[] args) {

        double amount = 0.0;

        double [] price = {2.14, 3.67 , 1.11 , 0.95 , 5.00};
        int [] kilo = {0 , 0 , 0 , 0 , 0};
        String[] list = {"Pear", "Apple", "Tomato", "Banana", "Eggplant"};

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5;i++){
            System.out.print("How Many Kilograms Of " + list[i] + " : ");
            kilo[i] = scanner.nextInt();
        }

        for( int i = 0 ; i < 5; i++ ){
            amount += kilo[i] * price[i];
        }
        System.out.println("Total Amount Is : " + amount);

    }
}