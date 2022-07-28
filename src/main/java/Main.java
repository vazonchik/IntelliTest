import java.util.ArrayList;

public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    static int countUserId = 1;
    static int countProductId = 1;

    public static void main(String[] args) {
        Console.start();

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

    public static void displayListOfAllUsers(){
        for(User user : users) System.out.println(user.getFirstName() + " " + user.getLastName());
    }

    public static void displayListOfAllProducts(){
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
