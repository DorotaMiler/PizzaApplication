package com.dm.pizza;

public class Pizza {
    static class PizzaBuilder {
        private final int size;
        private boolean cheese;
        private boolean ham;
        private boolean mashroom;

        PizzaBuilder(int size) {
            this.size = size;
        }

        PizzaBuilder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        PizzaBuilder setHam(boolean ham) {
            this.ham = ham;
            return this;
        }

        PizzaBuilder setMashroom(boolean mashroom) {
            this.mashroom = mashroom;
            return this;
        }

        Pizza build(){
            return new Pizza(size,cheese,ham,mashroom);
        }
    }

    private int size;
    private PizzaPrice price;
    private boolean cheese;
    private boolean ham;
    private boolean mashroom;
    private PizzaDiameter diameter;


    public Pizza() {
    }

    public Pizza(PizzaPrice price) {
        this.price = price;
    }

    public Pizza(PizzaDiameter diameter) {
        this.diameter = diameter;
    }

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    public Pizza(PizzaSize size, PizzaPrice price) {
        this.size = size;
        this.price = price;
    }

//    public PizzaSize getSize() {
//        return size = Math.PI * Math.pow(radius, 2);
//    }
//

    public double pizzasComparison(Pizza pizza1, Pizza pizza2) {
        for (int i = 0; i < 2; i++) {
            pizza1.size.ratioBasedOnChoice(pizza1.size)

            ratioBasedOnChoice(pizzaSize1).compareTo(pizzaSize2)
        }
    }




            System.out.println("Hi! Welcome to DM's pizza!"+"\nWhat pizza size would you like to order?"+"\n\n(advise of pizza diameter of choice: small -> 25cm, medium -> 40cm or big -> 50cm)"+"\n.......");
    Scanner scan = new Scanner(System.in);
    double chosenSize = scan.nextDouble();
            System.out.println("Thank you. You have chosen: "+chosenSize+" size pizza."="\nRatio calculation: ");


    Pizza pizza1 = new Pizza();

    Pizza pizza2 = new Pizza();


}


    sizeThenPrice(PizzaSize pizzaSize) {
        PizzaDiameter diameter = new PizzaDiameter();
        if (pizzaSize == null) {
            System.out.println("Please choose pizza's size!");
        } else {
            switch (pizzaSize) {
                case SMALL:
                    pizza.getDiameter() = SMALL;
                    PizzaPrice price = new PizzaPrice();
                    price.getPrice() = SM
            }
        }

        public PizzaSize getSize () {
            return size;
        }

        public PizzaDiameter getDiameter () {
            return diameter;
        }

        public PizzaPrice getPrice () {
            return price;
        }
    }