package ex4;

/**
 * NYPizzaStore
 */
public class NYPizzaStore extends PizzaStore{

    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                return new NYStyleCheesePizza();
            }
            case "veggie": {
                return new NYStyleVeggiePizza();
            }
            case "clam": {
                return new NYStyleClamPizza();
            }
            case "pepperoni": {
                return new NYStylePepperoniPizza();
            }
            default: {
                return null;
            }
        }
    }
}

