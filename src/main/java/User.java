import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private double amountOfMoney;
    private ArrayList<Product> boughtProducts = new ArrayList<>();

    public User(int id, String firstName, String lastName, double amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }



    public void buyProduct(Product product) throws Exception {
        if (this.getAmountOfMoney() - product.getPrice() < 0){
            throw new Exception(this.getFirstName() + " " + this.getLastName() + " have not enough money for buy " + product.getName());
        } else {
            setAmountOfMoney(this.getAmountOfMoney() - product.getPrice());
            boughtProducts.add(product);
            product.addOwnerToListOfOwners(this);
            System.out.println("successful purchase");
        }
    }

    public ArrayList<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(ArrayList<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n";
    }
}
