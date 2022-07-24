import java.util.Scanner;

public class Console {
    public static void start (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one of the follow command: \n" +
                "Add User - 'AddU'\n" +
                "Add Product - 'AddP'\n" +
                "Delete User - 'DelU'\n" +
                "Delete Product - 'DelP'\n" +
                "Display list of all users - 'DOU'\n" +
                "Display list of all products - 'DOP'\n" +
                "Display list of user products by user id - 'DUBI'\n" +
                "Display list of users that bought product by product id - 'DUPI");

        String command = scanner.nextLine();

        switch (command){
            case "AddU":

                scanner.close();
                break;
            case "AddP":
                System.out.println("vvv");
                scanner.close();
                break;
            case "DelU":

                scanner.close();
                break;
            case "DelP":

                scanner.close();
                break;
            case "DOU":

                scanner.close();
                break;
            case "DOP":

                scanner.close();
                break;
            case "DUBI":

                scanner.close();
                break;
            case "DUPI":

                scanner.close();
                break;
            default:
                System.out.println("Enter correct command");
                start();
        }
    }


}
