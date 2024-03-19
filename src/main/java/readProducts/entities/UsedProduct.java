package readProducts.entities;

import java.sql.Date;

public class UsedProduct extends Product {
    private Date manufactured;

    public UsedProduct(){

    }

    public UsedProduct(String name, double price, Date manufactured) {
        super(name, price);
        this.manufactured = manufactured;

    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }

    public String PriceTag(){
        System.out.println(getName() + "(Used)" + "$" + getPrice() + "(" + "Manufactured data: " + getManufactured() + ")");
        return null;
    }
}
