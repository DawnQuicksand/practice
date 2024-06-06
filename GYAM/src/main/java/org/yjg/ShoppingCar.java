package org.yjg;

import org.yjg.Fruit.Fruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCar {

    Map<Fruit, Double> fruits = new HashMap<Fruit, Double>();

    double total;

    // 满减额度
    double manjianAmount = -1;

    // 优惠金额
    double youhuiAmount = 0;


    public void addFruit(Fruit fruit, double num) {
        fruits.put(fruit, num);
    }

    public double getTotal() {
        total = 0;
        for (Fruit fruit : fruits.keySet()) {
            total = total + fruit.getPrice() * fruits.get(fruit);
        }
        if (manjianAmount != -1 && total > manjianAmount) {
            total = total - youhuiAmount;
        }
        return total;
    }

    public void setManjianAmount(double manjianAmount) {
        this.manjianAmount = manjianAmount;
    }

    public void setYouhuiAmount(double youhuiAmount) {
        this.youhuiAmount = youhuiAmount;
    }
}
