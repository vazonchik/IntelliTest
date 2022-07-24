import java.util.Scanner;

public class Console {
    public static void start () throws Exception {
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
                addNewUser();
                scanner.close();
                break;
            case "AddP":
                addNewProduct();
                scanner.close();
                break;
            case "DelU":
                deleteUser();
                scanner.close();
                break;
            case "DelP":
                deleteProduct();
                scanner.close();
                break;
            case "DOU":
                Main.displayListOfAllUsers();
                scanner.close();
                break;
            case "DOP":
                Main.displayListOfAllProducts();
                scanner.close();
                break;
            case "DUBI":
                System.out.println("Enter user id");
                Main.displayListOfUserProduct(scanner.nextInt());
                scanner.close();
                break;
            case "DUPI":
                System.out.println("Enter product id");
                Main.displayListOfBoughtProduct(scanner.nextInt());
                scanner.close();
                break;
            default:
                System.out.println("Enter correct command");
                start();
        }
    }

    private static void deleteProduct() {

    }

    private static void deleteUser() {

    }

    private static void addNewProduct() {

    }

    private static void addNewUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter throw gaps: first name, last name, sum of user's money");
        String firstName = " ";
        String lastName = " ";
        double amountOfMoney = 0;
        String dataForAddNewUser = scanner.nextLine();
        String[] strings = dataForAddNewUser.split(" ");
        if (strings.length != 3) throw new Exception("Enter correct data");

        if (strings[0].equals("/W")) {
            System.out.println("f");
            addNewUser();
            } else firstName = strings[0];
        if (strings[1].equals("/W")) {
            System.out.println("l");
                addNewUser();
            } else lastName = strings[1];
        if (strings[2].equals("/D")) {
            System.out.println("n");
                addNewUser();
            } else amountOfMoney = Double.parseDouble(strings[2]);

//        try {
//            if (strings[0].equals("/s")) {
//                addNewUser();
//            } else firstName = strings[0];
//        }catch (Exception e){
//            throw new Exception("Name doesn't consist not literal or numbers symbols");
//        }
//
//        try {
//            if (strings[1].equals("/s")) {
//                addNewUser();
//            } else lastName = strings[1];
//        }catch (Exception e){
//            throw new Exception("Lastname doesn't consist not literal or numbers symbols");
//        }
//
//        try {
//            if (!strings[2].equals("/d")) {
//                addNewUser();
//            } else amountOfMoney = Double.parseDouble(strings[2]);
//        }catch (Exception e){
//            throw new Exception("It mast be number");
//        }

//        if (!strings[2].equals("/[0-9]/")) {
//            throw new Exception("It mast be number");
//        } else amountOfMoney = Double.parseDouble(strings[2]);
        Main.users.add(new User(Main.countId, firstName, lastName, amountOfMoney));
        Main.countId++;

    }


}
