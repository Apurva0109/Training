package StreamTask;

public class Product {
    private String name;
    private int price;
    private String category;
    private String Grade;

    public Product(){

    }
    public Product(String name, int price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }
}
