package org.yjg.Fruit;


public class Fruit {


    //单价

    public double price;


    //折扣
    public double discount=1;


    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                ", discount=" + discount +
                '}';
    }

    public Fruit() {
    }

    public Fruit(double price) {
        this.price=price;
    }

    public Fruit(double price,double discount) {
        this.price=price;
        this.discount=discount;
    }



    public double getPrice() {
        if(discount!=1){
            return this.price * this.discount;
        }else {
            return this.price;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
