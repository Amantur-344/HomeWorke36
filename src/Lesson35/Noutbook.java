package Lesson35;

import Example.ComputerModel;
import Example.Laptop;

public class Noutbook extends Texnik{
    public Noutbook(Integer price, String model) {
        super(price, model);
    }

    @Override
    public Double getDiscount(Integer discount) {
        return getPrice() - getPrice() * (discount / 100.0);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Noutbook) {
            if(((Noutbook)obj).getPrice().equals(this.getPrice()) &&
                    ((Noutbook)obj).getModel().equals(this.getModel())) {
                return true;
            }
            return false;
        }
        return false;
    }

 }
