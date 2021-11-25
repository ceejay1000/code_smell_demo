package com.ceejay;

public class MysteriousVariables {

    // Mysterious variables
    private User u;
    private Order o;

    //Bad examples
    int max=7;
    int students=7;

    //Clean example
    int MAX_CLASSES_PER_STUDENT =7;

    Order order = new Order();

    // amount
    private double a = order.getAmount();

    // discount factor
    double b = 1;

//    if (a > 10) {
//        b = 0.9;
//    }

    private Product product = new Product();

    // discounted price
    double c = product.getPrice() * b;
    // order sum price
    double d = a * c;



    private class Order {

        public double getAmount(){
            return Math.random();
        }
    }

    private class Product{
        public double getPrice(){
            return Math.random();
        }
    }
}
