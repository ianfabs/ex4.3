package ex4;

/**
 * ChicagoStylePepperoniPizza
 */
public class ChicagoStylePepperoniPizza extends Pizza{

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish and Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

