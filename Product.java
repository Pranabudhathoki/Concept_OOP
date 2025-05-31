public class Product {
    private String name;
    private String productId;
    private double price;
    private int stockQuantity;

  
    public Product(String name, String productId, double price, int stockQuantity) {
        this.name = name;
        this.productId = productId;
        setPrice(price);
        this.stockQuantity = stockQuantity;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative. Setting to 0.");
            this.price = 0;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

  
    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println(quantity + " " + name + "(s) purchased.");
        } else {
            System.out.println("Invalid purchase quantity or insufficient stock.");
        }
    }


    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " " + name + "(s) added to stock.");
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }

    public static void main(String[] args) {
        Product laptop = new Product("Dell", "9310", 9999.99, 10);
        laptop.purchase(2);
        laptop.restock(5);
        System.out.println("Current stock: " + laptop.getStockQuantity());
    }
}