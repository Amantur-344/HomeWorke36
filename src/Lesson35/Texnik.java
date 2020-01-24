package Lesson35;

import java.util.Comparator;

public abstract class Texnik {
    private Integer price;
    private String model;

    public Texnik(Integer price, String model) {
        this.price = price;
        this.model = model;
    }




    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract Double getDiscount(Integer discount);

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + model + '\'' +
                '}';
    }



}
