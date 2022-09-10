import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String userName, password = "", newPassword;


    public static void main(String[] args) {


        System.out.print("Please Enter Username : ");
        userName = input.nextLine();

        System.out.print("Please Enter Password : ");
        userName = input.nextLine();

        if ((userName.equals("MTA")) && (password.equals("java123"))) {
            System.out.println("CORRECT");
        } else {
            System.out.println("WRONG");
            System.out.println("WOUWD YOU LIKE TO CHANGE YOUR PASSWORD : Y/N : ");
        }

        String ans;
        ans = input.nextLine();
        switch (ans) {
            case "Y":
            case "y":
                System.out.println("Please Enter New Passowrd");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("NEW PASSWORD CAN NOT BE SAME WITH THE OLD PASSOWRD");
                } else {
                    System.out.println("THE PASSORD IS CHANGED ");
                    System.out.println("NEW PASSWORD IS : " + newPassword);
                }
                break;

            case "N":
            case "n":
                System.out.println("YOU DID NOT WANT TO CHANGE PASSWORD");
                System.out.println("Exiting From Program");
                System.exit(1);
                break;

            default:
                System.out.println(ans + "IS INVALID CHOICE...");
                break;
        }
    }
}