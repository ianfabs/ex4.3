package ex4;

/**
 * ChicagoPizzaStore
 */
public class ChicagoStore extends PizzaStore{

    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                return new ChicagoStyleCheesePizza();
            }
            case "veggie": {
                return new ChicagoStyleVeggiePizza();
            }
            case "clam": {
                return new ChicagoStyleClamPizza();
            }
            case "pepperoni": {
                return new ChicagoStylePepperoniPizza();
            }
            default: {
                return null;
            }
        }
    }
}

