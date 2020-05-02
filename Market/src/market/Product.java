/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

/**
 *
 * @author Family
 */
public class Product {
    //Products Data model
    String product_name;
    int code, quantity;
    float price;

    //Constructor
    public Product(String product_name, int code, int quantity, float price) {
        this.product_name = product_name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    //Getter
    public String getProduct_name() {
        return product_name;
    }

    //Setter
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    
    //Getter
    public int getCode() {
        return code;
    }

    //Setter    
    public void setCode(int code) {
        this.code = code;
    }

    //Getter
    public int getQuantity() {
        return quantity;
    }

    //Setter
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Getter
    public float getPrice() {
        return price;
    }

    //Setter
    public void setPrice(float price) {
        this.price = price;
    }
}
