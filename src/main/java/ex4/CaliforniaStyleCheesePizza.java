package ex4;

/**
 * CaliforniaStyleCheesePizza
 */
public class CaliforniaStyleCheesePizza extends Pizza{

    public CaliforniaStyleCheesePizza() {
        name = "California Style Thin Crust Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Red Sauce";

        toppings.add("Sliced Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

