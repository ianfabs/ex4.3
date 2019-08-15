package ex4;

/**
 * CaliforniaStyleCheesePizza
 */
public class CaliforniaStyleSpicyPizza extends Pizza{

    public CaliforniaStyleSpicyPizza() {
        name = "Spicy California Style Thin Crust Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Red Sauce";

        toppings.add("Sliced Mozzarella Cheese");
        toppings.add("Siracha");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

