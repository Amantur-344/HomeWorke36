package Lesson35;

import Example.ComputerModel;
import Example.Laptop;

public class Price extends Texnik{
    public Price(Integer price, String model) {
        super(price, model);
    }

   // @Override
    public Double getDiscount(Integer discount) {
        return getPrice() - getPrice() * (discount / 100.0);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Price) {
            if(((Price)obj).getPrice().equals(this.getPrice()) &&
                    ((Price)obj).getModel().equals(this.getModel())) {
                return true;
            }
            return false;
        }
        return false;
    }
}