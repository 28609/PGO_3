public class Product {
    private String name;
    private double price;
    private String productCode;
    private int quantity;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.quantity = 0;
    }

    public Product(String name, double price, String productCode, int quantity) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.quantity = quantity;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Liczba sztuk nie może być mniejsza od 0.");
        }
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}