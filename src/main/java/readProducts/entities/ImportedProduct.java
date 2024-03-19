package readProducts.entities;

public class ImportedProduct extends Product {
    double customsFee;


    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price) {
        super(name, price);
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct(double customsFee) {
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public String PriceTag(){
        System.out.println(getName() + "$" + getPrice() + "(" + "Costums Fee" + getCustomsFee() + ")");
        return null;
    }

    public double TotalPrice (){
        return getPrice() + ((double) 60 / 100);
    }
}
