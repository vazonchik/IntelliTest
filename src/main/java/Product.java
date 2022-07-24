import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private double price;
    ArrayList<User> listOfOwners = new ArrayList<>();

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void addOwnerToListOfOwners (User user){
        listOfOwners.add(user);
    }

    public ArrayList<User> getListOfOwners() {
        return listOfOwners;
    }

    public void setListOfOwners(ArrayList<User> listOfOwners) {
        this.listOfOwners = listOfOwners;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
