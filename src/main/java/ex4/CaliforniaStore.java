package ex4;

/**
 * CaliforniaPizzaStore
 */
public class CaliforniaStore extends PizzaStore{

    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                return new CaliforniaStyleCheesePizza();
            }
            case "olive": {
                return new CaliforniaStyleOlivePizza();
            }
            case "spicy": {
                return new CaliforniaStyleSpicyPizza();
            }
            default: {
                return null;
            }
        }
    }
}

