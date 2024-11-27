package Country.Zones;

public class Product {
    private String productName;
    private String productDescription;
    private double productPrice;
    private Category category;


    public Product(String productName, String productDescription, double productPrice, Category category) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.category = category;
    }
}
