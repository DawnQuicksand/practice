package org.yjg;

import org.yjg.Fruit.Apple;
import org.yjg.Fruit.Fruit;
import org.yjg.Fruit.Mango;
import org.yjg.Fruit.Strawberry;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Fruit, Integer> fruits = new HashMap<Fruit, Integer>();


        Fruit apple = new Apple(8.0);
        Fruit strawberry = new Strawberry(13.0);
        Fruit mango = new Mango(20.0);

        ShoppingCar car1 = new ShoppingCar();
        car1.addFruit(apple, 3);
        car1.addFruit(strawberry, 5);
        System.out.println("问题1总价为：" + car1.getTotal());

        ShoppingCar car2 = new ShoppingCar();
        car2.addFruit(apple, 3);
        car2.addFruit(strawberry, 4);
        car2.addFruit(mango, 5);
        System.out.println("问题2总价为：" + car2.getTotal());

        strawberry.setDiscount(0.8);
        ShoppingCar car3 = new ShoppingCar();
        car3.addFruit(apple, 3);
        car3.addFruit(strawberry, 4);
        car3.addFruit(mango, 5);
        System.out.println("问题3总价为：" + car3.getTotal());

        ShoppingCar car4 = new ShoppingCar();
        car4.setManjianAmount(100);
        car4.setYouhuiAmount(10);
        car4.addFruit(apple, 3);
        car4.addFruit(strawberry, 4);
        car4.addFruit(mango, 5);
        System.out.println("问题4总价为：" + car4.getTotal());

    }
}