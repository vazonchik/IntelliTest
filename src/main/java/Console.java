import java.util.Scanner;

public class Console {
    public static void start () {
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

        switch (command) {
            case "AddU" -> {
                addNewUser();
                scanner.close();
            }
            case "AddP" -> {
                addNewProduct();
                scanner.close();
            }
            case "DelU" -> {
                deleteUser();
                scanner.close();
            }
            case "DelP" -> {
                deleteProduct();
                scanner.close();
            }
            case "DOU" -> {
                Main.displayListOfAllUsers();
                scanner.close();
            }
            case "DOP" -> {
                Main.displayListOfAllProducts();
                scanner.close();
            }
            case "DUBI" -> {
                System.out.println("Enter user id");
                Main.displayListOfUserProduct(scanner.nextInt());
                scanner.close();
            }
            case "DUPI" -> {
                System.out.println("Enter product id");
                Main.displayListOfBoughtProduct(scanner.nextInt());
                scanner.close();
            }
            default -> {
                System.out.println("Enter correct command");
                start();
            }
        }
    }

    private static void deleteProduct() {

    }

    private static void deleteUser() {

    }

    private static void addNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter throw gaps: name of product, cost of product");
        String name;
        double cost;
        String dataForAddNewUser = scanner.nextLine();
        String[] strings = dataForAddNewUser.split(" ");
        try {
            name = strings[0];
            cost = Double.parseDouble(strings[1]);
            Main.products.add(new Product(Main.countProductId, name, cost));
            Main.countProductId++;
            start();
        } catch (Exception e){
            System.out.println("Enter correct data");
            addNewProduct();
        }
    }

    private static void addNewUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter throw gaps: first name, last name, sum of user's money");
        String firstName;
        String lastName;
        double amountOfMoney;
        String dataForAddNewUser = scanner.nextLine();
        String[] strings = dataForAddNewUser.split(" ");

        try {
            firstName = strings[0];
            lastName = strings[1];
            amountOfMoney = Double.parseDouble(strings[2]);
            Main.users.add(new User(Main.countUserId, firstName, lastName, amountOfMoney));
            Main.countUserId++;
            start();
        } catch (Exception e){
            System.out.println("Enter correct data");
            addNewUser();
        }
    }
}
