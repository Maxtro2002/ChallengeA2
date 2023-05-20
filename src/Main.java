import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continues = true;
        while(continues){
            Scanner optionSelector = new Scanner(System.in);
            System.out.println("==================User Management==================\n" +
                    "1. Register user\n" +
                    "2. View users\n" +
                    "3. Remove user");

            System.out.print("Enter option > ");
            int option = optionSelector.nextInt();

            if(option == 1){
                System.out.println("Register");
            } else if(option ==  2){
                System.out.println("View");
            } else if (option == 3){
                System.out.println("Delete");
            } else {
                System.out.println("ERROR");
            } optionSelector.close();



        }
    }
}