package Lesson35;

import Example.Pc;

public class Computer extends Texnik{
    public Computer(Integer price, String model) {
        super(price, model);
    }
    private int diogonsl;

    public int getDiogonsl() {
        return diogonsl;
    }

    public void setDiogonsl(int diogonsl) {
        this.diogonsl = diogonsl;
    }

    public Computer(Integer price, String model, int diogonsl) {
        super(price, model);
        this.diogonsl = diogonsl;
    }

    @Override
    public Double getDiscount(Integer discount) {
        return getPrice() * 1.0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Pc) {
            if(((Pc)obj).getPrice().equals(this.getPrice()) &&
                    ((Pc)obj).getModel().equals(this.getModel()) &&
                    ((Pc)obj).getDiag().equals(this.getDiogonsl())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
