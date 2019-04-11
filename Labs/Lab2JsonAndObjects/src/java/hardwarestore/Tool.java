/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwarestore;

/**
 *
 * @author cadavi
 */
public class Tool {
    private int id;
    private String description;
    private float proce;
    private int stock;
    private boolean discount;

    public Tool(int id, String description, float proce, int stock, boolean discount) {
        this.id = id;
        this.description = description;
        this.proce = proce;
        this.stock = stock;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getProce() {
        return proce;
    }

    public void setProce(float proce) {
        this.proce = proce;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }    
}
