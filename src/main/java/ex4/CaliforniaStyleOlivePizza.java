package ex4;

/**
 * CaliforniaStyleCheesePizza
 */
public class CaliforniaStyleOlivePizza extends Pizza{

    public CaliforniaStyleOlivePizza() {
        name = "California Style Thin Crust Cheese Pizza With Olives";
        dough = "Extra Thin Crust Dough";
        sauce = "Red Sauce";

        toppings.add("Sliced Mozzarella Cheese");
        toppings.add("Olives");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

