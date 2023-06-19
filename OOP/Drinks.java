package OOP;

// Example of polymorphism

public class Drinks {
    public void drinkType() {
        System.out.println("There are different types of drinks");
    }
}

class Pop extends Drinks {
    public void drinkType() {
        System.out.println("Pop is a carbonated and sweetened drink. Not healthy!");
    }
}

class Water extends Drinks {
    public void drinkType() {
        System.out.println("Water is a healthy drink. Drink more water! :)");
    }
}

class Coffee extends Drinks {
    public void drinkType() {
        System.out.println("Coffee is a drink that contains caffeine. Healthy if you don't drink too much!");
    }
}


class Main {
    public static void main(String[] args) {
        Drinks myDrink = new Drinks();
        Drinks myPop = new Pop();
        Drinks myWater = new Water();
        Drinks myCoffee = new Coffee();

        myDrink.drinkType();
        myPop.drinkType();
        myWater.drinkType();
        myCoffee.drinkType();
    }
}
