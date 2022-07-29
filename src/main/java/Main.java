import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    static int countUserId = 1;
    static int countProductId = 1;

    public static void main(String[] args) {
        Console.start();

    }

    public static void displayListOfUserProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id");
        int id = scanner.nextInt();
        try {
            for (User user : users){
                if (user.getId() == id){
                    for (Product product : user.getBoughtProducts()){
                        System.out.println(product.getName());
                    }
                }
            }
        } catch (Exception e){
            System.out.println("User " + users.get(id).toString() + " haven't purchase");
        }
        Console.start();
    }

    public static void displayListOfBoughtProduct(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter id of product.");
            int id = scanner.nextInt();
            for (Product product : products){
                if (product.getId() == id){
                    for (User user : product.getListOfOwners()){
                        System.out.println(user.getFirstName() + " " + user.getLastName());
                    }
                }
            }
        } catch (Exception e){
            System.out.println("You enter wrong id.");
            displayListOfBoughtProduct();
        }
        Console.start();
    }

    public static void displayListOfAllUsers(){
        if (users.size() != 0){
            for(User user : users) System.out.println(user.getFirstName() + " " + user.getLastName());
            Console.start();
        } else System.out.println("You haven't users.");
        Console.start();
    }

    public static void displayListOfAllProducts(){
        if (products.size() != 0){
            for(Product product : products) System.out.println(product.getName() + " ");
            Console.start();
        } else System.out.println("You haven't products.");
        Console.start();
    }

    public static void buyProduct() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter id of user and id of product throw a gap");
            int idOfUser = scanner.nextInt();
            int idOfProduct = scanner.nextInt();
            for (User user : users){
                if (user.getId() == idOfUser){
                    if (user.getAmountOfMoney() - products.get(idOfProduct-1).getPrice() >= 0) {
                        user.setAmountOfMoney(user.getAmountOfMoney() - products.get(idOfProduct-1).getPrice());
                        for (Product product : products){
                            if (product.getId() == idOfProduct){
                                product.listOfOwners.add(users.get(idOfUser-1));
                                user.boughtProducts.add(products.get(idOfProduct-1));
                                System.out.println("successful purchase");
                                Console.start();
                            } else {
                                System.out.println("Wrong id of product");
                                buyProduct();
                            }
                        }
                    } else {
                        System.out.println(user.getFirstName() + " " + user.getLastName() + " have not enough money for buy " + products.get(idOfProduct-1).getName());
                        Console.start();
                    }
                } else {
                    System.out.println("Wrong id of user");
                    buyProduct();
                }
            }
            Console.start();
        } catch (Exception e){
            System.out.println("You enter wrong data (it mast be numbers)");
            Console.start();
        }
    }
}
