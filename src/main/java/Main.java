import java.util.ArrayList;

public class Main {
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        User user1 = new User(1, "Serhii", "Romanchuk", 55455);
        User user2 = new User(2, "Anton", "Tsimbaliuk", 12147);
        User user3 = new User(3, "Feofan", "Melnyk", 13);

        Product potato = new Product(1, "Potato", 25.40);
        Product cucumber = new Product(2, "Cucumber", 67.21);
        Product tomato = new Product(3, "Tomato", 31.87);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        products.add(potato);
        products.add(cucumber);
        products.add(tomato);
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
