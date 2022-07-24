import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    static int countId = 1;

    public static void main(String[] args) throws Exception {
        Console.start();


    }

    public static void addNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter throw gaps: first name, last name, sum of user's money");
        String dataForAddNewUser = scanner.nextLine();

        users.add(new User(countId, scanner.nextLine(), scanner.nextLine(), scanner.nextDouble()));
        countId++;

    }

    public static void displayListOfUserProduct(int id){
        for (User user : users){
            if (user.getId() == id){
                for (Product product : user.getBoughtProducts()){
                    System.out.println(product.getName());
                }
            }
        }
    }

    public static void displayListOfBoughtProduct(int id){
        for (Product product : products){
            if (product.getId() == id){
                for (User user : product.getListOfOwners()){
                    System.out.println(user.getFirstName() + " " + user.getLastName());
                }
            }
        }
    }

    public static void displayListOfAllUsers(ArrayList<User> users){
        for(User user : users) System.out.println(user.getFirstName() + " " + user.getLastName());
    }

    public static void displayListOfAllProducts(ArrayList<Product> products){
        for(Product product : products) System.out.println(product.getName() + " " + product.getName());
    }

    public static void buyProduct(int idOfUser, int idOfProduct) throws Exception {
        for (User user : users){
            if (user.getId() == idOfUser){
                for (Product product : products){
                    if (product.getId() == idOfProduct){
                        user.buyProduct(product);
                    }
                }
            }
        }
    }
}
